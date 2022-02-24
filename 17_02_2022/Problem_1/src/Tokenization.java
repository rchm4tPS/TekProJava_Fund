import java.util.*;

/** 
 * Tokenization of Inputted String!
 * The Tokenization program implements the split in java.lang.String.split
 * so each word (in general) can be tokenized. Moreover, using multiple
 * delimiter we can make more specific token so in each token, we exclude
 * multiple delimiter from inputted String.
 * 
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 */

public class Tokenization {
	
	/**
	 * This is the only method in class Tokenization called main.
	 * 
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create new scanner to receive input
		
		short tokens = 0;  // can store value up to 32.767
		
		/* Create an array of string which excluding the written delimiter
		 * using split() method. Characters between square brackets can be
		 * combined one to another (more than 1 delimiter can be determined)
		 * by the '+' operator next to the square brackets. Inspired from :
		 * https://stackoverflow.com/questions/19967972/using-multiple-delimiters-for-split-in-java/19967996 */
		String[] s = sc.nextLine().split("[!,?._'@\\s]+");
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);  // print each token line by line
			tokens++;  // increment the value of 'tokens' after print one token each line
		}
		
		System.out.println(tokens);  // print the number of "tokens" found on inputted string
		sc.close();  // close the scanner after if you don't need it anymore
	}

}
