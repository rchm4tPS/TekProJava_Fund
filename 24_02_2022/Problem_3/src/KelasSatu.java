/**
 * <h1> Kelas Satu Class </h1>
 * This class simply contains some blocks that will print some numbers out to the console
 * if there is an invocation or if there any method that make use of this class' constructor.
 * It is called initialization block that can contain arbitrary blocks of code.
 * 
 * @author Rachmat Purwa Saputra / 211524054
 * @version 1.0
 * @since 24-02-2022
 *
 */

public class KelasSatu {
	//this is called as object initialization block
	{
		System.out.println(11);
	}
	
	// this is called as static initialization block
	// this will always be executed when KelasSatu class first loaded
	static
	{
		System.out.println(2);
	}
	
	// two constructor below will be executed after two initialization blocks above run
	// this is constructor block if and only if the constructor has an integer parameter
	public KelasSatu(int i)
	{
		System.out.println(3);
	}
	
	// and this is constructor block that don't have any parameter on it
	public KelasSatu() {
		System.out.println(4);
	}
}  // End of KelasSatu Class
