import java.util.Scanner;

/**
 * <h1> Determine Data Types of Numbers Entried </h1>
 * This program intended to determine whether each inputed numbers
 * from user are capable to be stored by data type(s) in Java environment,
 * then determine which data type does the number can be stored within.
 * <p>
 * The four major numerical data type used as a categorization in this program
 * are byte, short, int, and long data type. Each data type has its own range
 * capabilities to store a numerical value.
 *
 * @author 	Rachmat Purwa Saputra (NIM : 211524054)
 * @version	1.0
 * @since	2022-02-10
 *
 */

public class DetermineDataTypes {
	
	/**
	 * This is the main method which makes use of two other method (entryNumbers
	 * and classificateNumbers).
	 * @param args Unused.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCaseNum = scanner.nextInt();

		String[] numbersEntried = new String[testCaseNum];

		entryNumbers(numbersEntried, testCaseNum);
		classificateNumbers(numbersEntried);

		scanner.close();
	}
	
	/**
	 * This method is used to receive inputs from user, in order to fill
	 * array of Strings that will contain numbers strings from user.
	 * The number of elements to fill the array of String is
	 * as much as T elements inputed by user in main method.
	 * @param str This is the first parameter to entryNumber method
	 * @param idx This is the second parameter to entryNumber method
	 */

	public static void entryNumbers(String[] str, int idx) {
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < idx; i++) {
			str[i] = scanner.nextLine();
		}

		scanner.close();

	}
	
	/**
	 * This method is used to print some messages about the data type that
	 * can be applied to T numbers of elements inputed by user before.
	 * Hence, it will print the name of some applicable data type for
	 * the numbers inputed by user. If it's not applicable due to the
	 * range value limitation of data type, it will print messages telling that
	 * the numbers can't be fitted to any data type.
	 * @param strNum This is the only parameter for classificateNumbers method
	 */

	public static void classificateNumbers(String[] strNum) {
		long[] hasilParse = new long[strNum.length];

		for(int i = 0; i < strNum.length; i++) {
			try {
				hasilParse[i] = Long.parseLong(strNum[i]);

				System.out.println(strNum[i] + " can be fitted in:");
				if(hasilParse[i] <= Byte.MAX_VALUE && hasilParse[i] >= Byte.MIN_VALUE)
					System.out.println("* byte");
				if(hasilParse[i] <= Short.MAX_VALUE && hasilParse[i] >= Short.MIN_VALUE)
					System.out.println("* short");
				if(hasilParse[i] <= Integer.MAX_VALUE && hasilParse[i] >= Integer.MIN_VALUE)
					System.out.println("* int");
				if(hasilParse[i] <= Long.MAX_VALUE && hasilParse[i] >= Long.MIN_VALUE)
					System.out.println("* long");
			} catch (NumberFormatException f) {
				System.out.println(strNum[i] + " can't be fitted anywhere");
			}
		}
	}

}
