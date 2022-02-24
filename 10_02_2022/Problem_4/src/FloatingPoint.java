/**
 * <h1>Program with Mathematical Operator</h1>
 * The FloatingPoint program is a program that makes use of
 * some numerical data type inside of the body of this
 * program in order to run with some mathematical operator.
 * The operator used here is Math.round() from java.math library.
 * It simply just type-cast the result of rounded number to int
 * data type, without outputting anything to the screen.
 * <p>
 * 
 * @author	Rachmat Purwa Saputra (NIM : 211524054)
 * @version	1.0
 * @since	2022-02-11
 *
 */

public class FloatingPoint {
	
	/**
	 * This main method will be run once the program runs.
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		double x = 92.98;
		/* the return type after this number uses Math.round() 
		 * is long data type, so it should be stored within the identifier
		 * with long data type. Here, we use explicit type casting to the
		 * return value so it can be stored within identifier with integer
		 * data type. */
		int nx = (int) Math.round(x);
		System.out.print(nx); //print the rounded number to the screen
	}

}
