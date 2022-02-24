/**
 * <h1>Program with Constants</h1>
 * The Constants program is a program that makes use of
 * constants inside the body of this program, especially
 * within the Constants.main() method. It will print the
 * output to the console to tell user about the paper size
 * in centimeters.
 * <p>
 * 
 * @author	Rachmat Purwa Saputra (NIM : 211524054)
 * @version	1.0
 * @since	2022-02-11
 *
 */

public class Constants {
	
	/**
	 * This main method will be run once the program runs.
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		/*The constant CM_PER_INCH refers to the size of
		  one inch when is being read in or converted to centimeters.
		  Can only be accessed within this method.*/
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		//Concatenate the string with '+' operator
		System.out.println("Paper size in centimeters: " +
				paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}

}
