/**
 * <h1> Inventori Class </h1>
 * This class makes use of Barang class (it's location is in the same package
 * where Inventori class located in).
 * 
 * @author Rachmat Purwa Saputra / 211524054
 * @version 1.0
 * @since 24-02-2022
 *
 */

public class Inventori {
	Barang[] barangs;
	
	/**
	 * This method will create new instance of Barang class.
	 */
	
	void initBarang() {
		barangs = new Barang[2];  // new instance called array of barangs of type Barang
		barangs[0] = new Barang("001", "Baju", 10);  // construct first new object
		barangs[1] = new Barang("002", "Celana", 20);   // construct second new object
	}
	
	/**
	 * This method will print out the name of barang object along with its stock number.
	 */
	
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	/**
	 * This method will call initBarang() method. After that, pengadaan will act as
	 * increaser value for stok value when its mutator is called. Finaly, this method will
	 * print out the name of barang object along with its stock number.
	 */
	
	void pengadaan() {
		initBarang();
		
		// mutator called just for first object of array of barangs object of type Barang
		barangs[0].setStok(20);  // the stok number will increase 20
		barangs[0].setStok(30);	 // then, the stok number will increase 30
		barangs[0].setStok(30);  // finally, the stok number will increase 30
		
		showBarang();  // show the name of barang with the stok number after mutated by mutator
	}
	
	/**
	 * This is the one and only main method for Inventori class.
	 * @param args Unused.
	 */
	
	public static void main(String[] args) {
		Inventori beli = new Inventori();  // create new object called beli of Inventory type
		beli.pengadaan();  // access pengadaan method available in beli object.
	}
}  // end of Inventori class
