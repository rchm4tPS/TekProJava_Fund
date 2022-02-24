import java.util.*;

/** 
 * <h1>Simple One-Line Calculator</h1>
 * This program will execute some simple equation solving between two numbers with one
 * of the five primitives operator in math; including addition, subtraction,
 * multiplication, division, and modulus.
 *  
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 */

public class SimpleCalculator {
	
	/**
	 * This main method will call one of five methods available in this class.
	 * User write the input like this :
	 *     (first number) (operator) (second number)
	 * then it will print the result between two number's calculation.
	 * 
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);  // read what operator written
		int num2 = sc.nextInt();
		int result = 0;
		
		switch(operator){	// do based on the operator written by user
			case '+':
				result = adding(num1, num2);	// if the operator is '+'
				break;
			case '-':
				result = subtracting(num1, num2);	// if the operator is '-'
				break;
			case '*':
				result = multiply(num1, num2); // if the operator is '*'
				break;
			case '/':
				result = dividing(num1, num2); // if the operator is '/'
				break;
			case '%':
				result = modulus(num1, num2);  // if the operator is '%'
				break;
			default:
				System.out.println("Operasi tidak tersedia!");
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
	/**
	 * This adding method will return the value of addition between two number
	 * which is passed as arguments to this method.
	 * @param num1 The first number
	 * @param num2 The second number
	 * @return int
	 */
	
	public static int adding(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * This subtracting method will return the value of subtraction between two number
	 * which is passed as arguments to this method.
	 * @param num1 The first number 
	 * @param num2 The second number
	 * @return int
	 */
	
	public static int subtracting(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * This multiply method will return the value of multiplication between two number
	 * which is passed as arguments to this method.
	 * @param num1 The first number 
	 * @param num2 The second number
	 * @return int
	 */
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * This dividing method will return the value of division between two number
	 * which is passed as arguments to this method.
	 * @param num1 The first number 
	 * @param num2 The second number
	 * @return int
	 */
	
	public static int dividing(int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * This modulus method will return the value of modulus between two number
	 * which is passed as arguments to this method.
	 * @param num1 The first number 
	 * @param num2 The second number
	 * @return int
	 */
	
	public static int modulus(int num1, int num2) {
		return num1 % num2;
	}

}
