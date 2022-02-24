import java.math.BigInteger;
import java.util.*;

/**
 * <h1>Big Number Program</h1>
 * In this program, you can doing multiplication and addition operation
 * to both numbers inputted by user that is treated as big integer. Big
 * integer is useful for doing some calculation with big numbers that is
 * greater than the number value can be stored by long integer type.
 * 
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 *
 */

public class BigNumber {
	
	/**
	 * In this main method, the user have to input two numbers. For the output,
	 * program will show the result of addition and multiplication of both numbers.
	 * 
	 * @param args Unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));  // equals to a + b for big integer
		System.out.println(a.multiply(b));  // equals to a * b for big integer
		
		sc.close();
	}

}
