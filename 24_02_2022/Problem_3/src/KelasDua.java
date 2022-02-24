/**
 * <h1> Kelas Dua Class </h1>
 * This class will simply print some numbers, both from this class itself and from
 * KelasSatu class that is called using constructor.
 * 
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 24-02-2022
 *
 */

public class KelasDua {
	// this initialization block will be executed if object of type KelasDua constructed
	{
		System.out.println(5);
	}
	
	/**
	 * This main method will construct two object, w/ type KelasSatu and KelasDua respectively. 
	 * @param args Unused.
	 */
	
	public static void main(String[] args) {
		System.out.println(6);  // prints number 6 first when KelasDua Class runs
		KelasSatu satu = new KelasSatu();  // construct new object satu of KelasSatu class
		KelasDua dua = new KelasDua();	// construct new object dua of KelasDua class
	}
}  //End of KelasDua class
