/**
 * <h1>Variants of Program with Constants</h1>
 * The Constants2 program is simply a variation of
 * Constants program within the same project folder where
 * these two programs belong to. It prints the text
 * output to the console to tell user about the paper size
 * in centimeters.
 * <p>
 * 
 * @author	Rachmat Purwa Saputra (NIM : 211524054)
 * @version	1.0
 * @since	2022-02-11
 *
 */

public class Constants2 {
	/*The constant CM_PER_INCH refers to the size of
	  one inch when is being read in or converted to centimeters.
	  Can be accessed only by the method with static keyword.*/
	public static final double CM_PER_INCH = 2.54;
	
	/**
	 * This main method will be run once the program runs.
	 * @param args Unused.
	 */
	
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		//Concatenate the string with '+' operator
		System.out.println("Paper size in centimeters: " +
				paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
