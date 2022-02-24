import java.util.*;

/**
 * <h1>Multi Dimensional Array in Java!</h1>
 * At the end of this program's run-time, user will see a bunch of numbers
 * collected as array, and print them like a representation of 3 (three)
 * dimensional array in 2 (two) dimension perspective.
 * 
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 *
 */
public class MDArrayJava {
	
	/**
	 * This is the main method of this program.
	 * 
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		// One Dimensional Arrays
		int[] firstArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19, 20, 21};
		int[] eighthArray = {22, 23, 24};
		int[] ninthArray = {25, 26, 27};
		
		// Two Dimensional Arrays (get each elements from one dimensional array)
		int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		
		// Three Dimensional Arrays (get each elements from two dimensional array)
		int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		
		/* Using deepToString method as it returns a string representation
		 * of the "deep content" of specified nested arrays. In another word,
		 * this method is used for converting multidimensional arrays to strings.*/
		for (int[][] x : threeDimensionalArray) {
			// replace the '[', ']', and ',' symbol appears at console to '{', ' }', and '' respectively
			System.out.println(Arrays.deepToString(x).replaceAll("\\[", "{").replaceAll("\\]", " }").replaceAll(",", ""));
		}
	}

}
