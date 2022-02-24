import java.util.*;

/**
 * <h1> Some String Operation Performed </h1>
 * This program is intended to do some string operated to inputted
 * string by user from standard input device (keyboard). Furthermore,
 * it prints the sum of two strings' length, then status of
 * lexicographical order of two string inputted, and last the two
 * strings concatenated and printed by capitalizing each of its first
 * character.
 * 
 * @author	Rachmat Purwa Saputra (NIM : 211524054)
 * @version 1.0
 * @since	2022-02-10
 * 
 */

public class StringOperations {
	
	/**
	 * This is the main method which makes use of two other
	 * method (twoArrLengthSum and printCapitalizeFirst).
	 * @param args Unused.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String firstStr = scanner.nextLine(); 
		String secondStr = scanner.nextLine();
		
		System.out.println(twoArrLengthSum(firstStr, secondStr));
		
		if(firstStr.compareTo(secondStr) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		printCapitalizeFirst(firstStr, secondStr);
		
		scanner.close();
	}
	
	/**
	 * This method is used to calculate sum of two string's lengths.
	 * @param str1 This is the first parameter to twoArrLengthSum method
	 * @param str2 This is the second parameter to twoArrLengthSum method
	 * @return int This returns a value of the sum of length of two strings
	 */
	
	public static int twoArrLengthSum(String str1, String str2) {
		return str1.length() + str2.length();
	}
	
	/**
	 * This method is used to make a change of capitalization of each word
	 * for two strings. Each first character in each string will be capitalized.
	 * @param str1 This is the first parameter to printCapitalizeFirst method
	 * @param str2 This is the second parameter to printCapitalizeFirst method
	 */
	
	public static void printCapitalizeFirst(String str1, String str2) {			
		System.out.println(str1.replace(str1.charAt(0), str1.toUpperCase().charAt(0)) + 
				" " + str2.replace(str2.charAt(0), str2.toUpperCase().charAt(0)));
		
	}
}
