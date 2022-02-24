/**
 * <h1> UpinIpin Class </h1>
 * 
 * This class makes use of Item class in order to print something based on
 * String whose value is assigned at object constructor's instance field. Any string
 * passed as parameter to constructor Item in main method here will be ignored.
 * 
 * @author Rachmat Purwa Saputra / 211524054
 * @version 1.0
 * @since 24-02-2022
 *
 */

public class UpinIpin {
	
	/**
	 * This is the one and only main method available in UpinIpin class. It will
	 * construct new object called name with Item type.
	 * @param args Unused.
	 */
	
	public static void main(String[] args) {
		/* Create new object called name with Item type */
		Item name = new Item("upin");  // pass upin string to the constructor
	}
}  // end of UpinIpin class
