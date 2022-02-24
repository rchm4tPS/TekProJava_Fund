/**
 * <h1>Program That Use Numerical Data Type Conversion</h1>
 * The ConvertDataType program is a program that is intended to
 * give us one example on how data type conversion works with
 * numerical data type, like from long to int, or double to float,
 * and so on. It should be noted that the data type conversion
 * can only work from the data type with the size bigger than
 * the targetted data type's size.
 * <p>
 * 
 * @author	Rachmat Purwa Saputra (NIM : 211524054)
 * @version	1.0
 * @since	2022-02-11
 *
 */

public class ConvertDataType {
	
	/**
	 * This method is used to convert the whole-number-related data type.
	 * @param l This is the first and only parameter to methodOne method, with long data type
	 * @return short This method returns the number that type-casted as short
	 */
	
	static short methodOne(long l) {
		int i = (int) l;
		return (short) i; //Type-casted to short in order to match it with return type of this method
	}
	
	/**
	 * This main method will be run once the program runs. In this main body method,
	 * the methodOne method will be called, and passed a long type number as its
	 * parameters. Besides that, it also convert the floating point related data type.
	 * Lastly, it will print the converted number of b.
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f); //the short return type from methodOne should be type-casted to byte
		System.out.println(b);
		
		double nomorGede = 1234567890123456789.0;
		System.out.println((long)nomorGede);
		
		byte nomorKecil = 12;
		System.out.println((long)nomorKecil);
	}

}
