import java.util.*;

/**
 * <h1>Buka Tutup Jalan Program</h1>
 * Program ini bertujuan untuk menampilkan status informasi apakah
 * empat buah mobil dengan plat nomor tertentu pada satu waktu boleh
 * jalan atau berhenti berdasarkan perhitungan tertentu. 
 * 
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 *
 */

public class BukaTutupJalan {
	
	/**
	 * Satu buah method main tempat mulai program bekerja saat di run.
	 * 
	 * @param args Unused.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long nomor = 0L;  // menampung 16 buah digit yg merupakan gabungan dari 4 nomor mobil
		
		String inputNomor = sc.nextLine().replaceAll("\\s", ""); // menghapus spasi antara string yg diinput
		
		nomor = Long.parseLong(inputNomor);  // parse menjadi bilangan bertipe long integer
		
		if((nomor - 999999) % 5 == 0)
			System.out.println("berhenti");
		else
			System.out.println("jalan");
		
		sc.close();
	}

}
