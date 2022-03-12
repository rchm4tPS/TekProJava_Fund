
import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("BL", "Bala-Bala", 1_000, 20);
		Restaurant.nextId();	// next id menset jumlah maksimal elemen makanan
		menu.tambahMenuMakanan("GH", "Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("TH", "Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("ML", "Molen", 1_000, 20);
		
		// penambahan bagian kode di class RestaurantMain ada di bawah
		
		Scanner sc = new Scanner(System.in);
		
		String foodCode[] = new String[4]; // constants 4 can be changed later
		double totalBill = 0;
		int Qty[] = new int[4];
		int Qtys = 0, itrs = 0;
		char menuChosen = '0';
		
		while (menuChosen != '1') {
			
			menu.tampilMenuMakanan();
			
			System.out.println(" \n:::::>>>>> SELAMAT DATANG, SILAKAN PESAN SATU MAKANAN <<<<<:::::\n");
			System.out.print("Kode makanan yang dipesan (2 huruf kapital sesuai di tabel) : ");
			foodCode[itrs] = sc.nextLine();
			
			System.out.print("Jumlah yang dipesan : ");
			Qty[itrs] = sc.nextInt();
			sc.skip("[\r\n]");
			
			menu.orderFood(foodCode[itrs], Qty[itrs]);
			
			if (menu.countTheBill(foodCode[itrs], Qty[itrs]) != 0) {
				totalBill += menu.countTheBill(foodCode[itrs], Qty[itrs]);
				Qtys += Qty[itrs];
				menu.reduceFoodStock(foodCode[itrs], Qty[itrs]);
				itrs++;
			}
						
			System.out.print("Ingin memesan lagi ? [ketik 0 jika Ya; ketik 1 jika Tidak] --> ");
			menuChosen = sc.next().charAt(0);
			sc.nextLine();
			
			if (menuChosen == '1') itrs--;
			
		}
		
		// invoice masih belum print elemen terakhir jika makanan yg dipesan lebih dari 2
		menu.printInvoice(foodCode, Qtys, totalBill, Qty, itrs);
		
		sc.close();
	}
}
