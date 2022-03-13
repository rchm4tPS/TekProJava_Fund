
public class Restaurant {
	// keempat data diubah access modifier nya menjadi protected, enkapsulasi di class baru bernama 'Food'
	
	protected String[] order;	// addition of data field for class Restaurant
	protected String[] nama_makanan;
	protected double[] harga_makanan;
	protected int[] stok;
	protected static byte id = 0;
	
	// another addition of data field for class Restaurant
	protected int stock_awal;
	Food[] daftarMenu = new Food[4];	// create new instance of Food class called 'daftarMenu' as array of 4 elements
	
	public Restaurant() {
		order = new String[10];	// addition of new data field for constructor of class Restaurant
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	// menambah satu parameter ke method ini, yakni menuCode bertipe String
	public void tambahMenuMakanan(String menuCode, String nama, double harga, int stok) {
		daftarMenu[id] = new Food(menuCode, nama, harga, stok);
	}
	
	public void tampilMenuMakanan() {
		for (int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.printf("%2s  %-12s [%02d]    Rp. %7.2f\n", daftarMenu[i].getOrdered_food(), daftarMenu[i].getFood_name(),daftarMenu[i].getFood_stock(), daftarMenu[i].getFood_price());
			} 
		}
	}
	
	public boolean isOutOfStock(int id) {
		if (daftarMenu[id].getFood_stock() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
	
	// kemudian menambah 4 buah method baru di bawah ini :
	
	public void orderFood (String menuCode, int jmlPesanan) {
		int tmp_idx = -999;
		
		for (int i = 0; i <= id; i++) {
			if (menuCode.compareTo(daftarMenu[i].getOrdered_food()) == 0) {
				if (jmlPesanan <= daftarMenu[i].getFood_stock()) {
					tmp_idx = i;
				}
				else {
					System.out.println("Jumlah yang dipesan melebihi kapasitas stok");
					break;
				}
			}
		}
		
		if (tmp_idx == -999) System.out.println("Food unavailable!!!\n");
		else if (daftarMenu[tmp_idx].getFood_stock() < jmlPesanan) {
			System.out.println("Food stock is UNDERFLOW!!! Please choose another food or reduce the amount of ordered food\n");
		}
		else System.out.println("Successfully order the food!!!\n");
	}
	
	public double countTheBill (String menuCode, int jmlPesanan) {
		double totalBill = 0;
		int tmp_idx = -999;
		
		for (int i = 0; i <= id; i++) {
			if (menuCode.compareTo(daftarMenu[i].getOrdered_food()) == 0) {
				stock_awal = daftarMenu[i].getFood_stock();
				if (stock_awal >= jmlPesanan) { tmp_idx = i; }
			}
		}
		
		if (tmp_idx != -999) totalBill = (daftarMenu[tmp_idx].getFood_price() * jmlPesanan);
		
		return totalBill;
	}
	
	public void printInvoice (String[] menuCode, int jmlPesanan, double totalBill, int[] qty, int brg) {
		System.out.println("\n==========:::::::>>>>>{ INVOICE SUMMARY }<<<<<:::::::==========\n");
		System.out.println("\n >>> FOOD ORDERED ARE LISTED BELOW : ");
		
		for (int i = 0; i <= brg; i++) {
			for (int j = 0; j <= id; j++) {
				if (menuCode[i].compareTo(daftarMenu[j].getOrdered_food()) == 0 && menuCode[i] != null) {
					System.out.printf("\n  %-12s [%02d  buah]", daftarMenu[j].getFood_name(), qty[i]);
					j = 999;
				}
			}
		}
		
		System.out.print("\n\n >>> AMOUNT OF FOOD ORDERED : ");
		System.out.println(jmlPesanan + " buah. \n");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("  You have to pay     :  " + totalBill + " !!!\n");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
	}
	
	public void reduceFoodStock (String menuCode, int jmlTerjual) {
		for (int i = 0; i <= id; i++) {
			if (menuCode.compareTo(daftarMenu[i].getOrdered_food()) == 0) {
				daftarMenu[i].setFood_stock(daftarMenu[i].getFood_stock() - jmlTerjual);
			}
		}
	}
	
	// end of Restaurant Class
	
}

// membuat/menambah class baru bernama food, menerapkan konsep enkapsulasi
class Food {
	private String ordered_food;
	private String food_name;
	private double food_price;
	private int food_stock;
	
	// constructor berparameter
	public Food(String menuCode, String food_name, double price, int stock) {
		ordered_food = menuCode;
		this.food_name = food_name;
		this.food_price = price;
		this.food_stock = stock;
	}

	// rangkaian getter dan setter untuk class 'food'.
	/**
	 * @return the ordered_food
	 */
	public String getOrdered_food() {
		return ordered_food;
	}

	/**
	 * @param ordered_food the ordered_food to set
	 */
	public void setOrdered_food(String ordered_food) {
		this.ordered_food = ordered_food;
	}

	/**
	 * @return the food_name
	 */
	public String getFood_name() {
		return food_name;
	}

	/**
	 * @param food_name the food_name to set
	 */
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	/**
	 * @return the food_price
	 */
	public double getFood_price() {
		return food_price;
	}

	/**
	 * @param food_price the food_price to set
	 */
	public void setFood_price(double food_price) {
		this.food_price = food_price;
	}

	/**
	 * @return the food_stock
	 */
	public int getFood_stock() {
		return food_stock;
	}

	/**
	 * @param food_stock the food_stock to set
	 */
	public void setFood_stock(int food_stock) {
		this.food_stock = food_stock;
	}	
}
