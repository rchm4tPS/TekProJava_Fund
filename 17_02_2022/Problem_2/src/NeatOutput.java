import java.util.*;

/** 
 * <h1>Make the output left-indented by formatting</h1>
 * The NeatOutput program implements the printf formatting output
 * so any number or character that has its own format specifier (%)
 * can be written out to the console neatly.
 * 
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 */

public class NeatOutput {
	
	/**
	 * This main method call one method (printFormatted) in its body.
	 * User write the input then it will print the formatted output.
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final byte MAX_EL = 3;  // make a constant for max element of array
		
		String[] s = new String[MAX_EL];
		int[] value = new int[MAX_EL];
		
		for(int i = 0; i < MAX_EL; i++) {
			s[i] = sc.next();
			value[i] = sc.nextInt();
		}
		
		printFormatted(s, value, MAX_EL); // calling printFormatted method
		
		sc.close();
	}
	
	/**
	 * This method is used to print formatted input from user. Inspired from :
	 * https://www.journaldev.com/28692/java-printf-method 
	 * 
	 * @param S This is the first parameter to printFormatted method
	 * @param val This is the second parameter to printFormatted method
	 * @param M This is the third parameter to printFormatted method
	 */
	
	public static void printFormatted(String[] S, int[] val, byte M) {
		System.out.println("================================");
		for(int i = 0; i < M; i++) {
			System.out.printf("%-15s", S[i]);	// left indent, with 15 blocks of string
			System.out.printf("%03d%n", val[i]);  // write 3 block for ints, but has leading zero if its digit less than 3
		}
		System.out.println("================================");
	}

}
