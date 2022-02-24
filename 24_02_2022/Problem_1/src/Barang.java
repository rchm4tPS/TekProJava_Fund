/**
 * <h1> Barang Class </h1>
 * This class uses encapsulation method in its implementation.
 * Complete with getter and setter for its private "stok" instance variable,
 * and also the constructor for object with Barang type.
 * 
 * @author Rachmat Purwa Saputra / 211524054
 * @version 1.0
 * @since 24-02-2022
 *
 */

public class Barang {
	String kode_barang;		// default access modifier, make this variable 
	String nama_barang;		// can be accessed by other classes in the same package
	private int stok;		// made stok variable hidden from other classes

	/**
	 * This method acts as accessor for the value reserved in stok variabel.
	 * 
	 * @return stok 
	 */
	
	public int getStok() {
		return stok;
	}
	
	/**
	 * This method acts as mutator for the value "stok" passed to this method.
	 * The only operator that valid for this method is addition. It will increment
	 * the value of stok before calling this method with the stok value passed to
	 * this method. As the result, value of stok will always increment, hence subtracting or
	 * multiplying or dividing the stok value are forbidden)
	 * 
	 * @param stok stok value that will be increased by this method
	 */

	public void setStok(int stok) {
		this.stok += stok;
	}
	
	// Constructor for object with Barang type
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}

} // end of Barang class
