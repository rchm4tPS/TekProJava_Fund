import java.util.*;

/** 
 * <h1>Gaji Agent!</h1>
 * This program will doing some calculations to an agent salary
 * based on their own sale. It can be increased or decreased from
 * their basic salary rate.
 *  
 * @author Rachmat Purwa Saputra
 * @version 1.0
 * @since 2022-02-19
 */

public class GajiAgent {
	
	/**
	 * This is the only method in this class, called main.
	 * User write the number input to tell how many sale of an agent,
	 * then it will print the final salary of that agent.
	 * 
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		int gajiPokok = 500_000;
		final int hargaSatuan = 50_000;	     // constant of fixed harga satuan
		Scanner sc = new Scanner(System.in);
		
		short itemSold = sc.nextShort();   // can take up to about 32.000
		
		/* doing some calculation based on the value of itemSold by an agent */
		if(itemSold > 80) {
			gajiPokok += (int)(0.35 * itemSold * hargaSatuan);
		} else if(itemSold >= 40) {
			gajiPokok += (int)(0.25 * itemSold * hargaSatuan);
		} else if(itemSold >= 15) {
			gajiPokok += (int)(0.10 * itemSold * hargaSatuan);
		} else {
			gajiPokok += (int)(0.15 * (itemSold - 15) * hargaSatuan); // regarded as "denda"
		}
		
		System.out.println(gajiPokok);
		
		sc.close();
	}

}
