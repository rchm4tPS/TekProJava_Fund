/**
 * Program		: AssociationExample.java
 * @author Rachmat Purwa Saputra, 211524054
 * @since 20 March 2022
 */

package myPackage;
import java.util.*;

class Seller {
	private String sellerName;
	private int income = 0;
	List<Buyer> buyers;

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public int getIncome() {
		return income;
	}
	
	public void setIncome(int money) {
		this.income += money;
	}
	
	public void sellTheProducts() {
		System.out.println("For now, this is all I can sell . . .");
	}
	
	public List<Buyer> getBuyers() {
		return buyers;
	}

	public void setBuyers(List<Buyer> buyers) {
		this.buyers = buyers;
	}

}

class Buyer {
	private String buyerName;
	private int cashInWallet;

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public int getCashInWallet() {
		return cashInWallet;
	}

	public void setCashInWallet(int cashInWallet) {
		this.cashInWallet = cashInWallet;
	}
	
	@Override
	public String toString() {
		return buyerName;
	}
}

public class AssociationExample {
	public static void main(String[] args) {
		Seller seller = new Seller();
		seller.setSellerName("Budianto");
		
		Buyer buyer1 = new Buyer();
		buyer1.setBuyerName("Hartawan");
		Buyer buyer2 = new Buyer();
		buyer2.setBuyerName("Rasyidi");
		Buyer buyer3 = new Buyer();
		buyer3.setBuyerName("Hadid");
		
		List<Buyer> empList = new ArrayList<Buyer>(3);
		empList.add(buyer1);
		empList.add(buyer2);
		empList.add(buyer3);
		
		seller.setBuyers(empList);
		
		System.out.println(seller.getBuyers()+" are buyers in the store of "+seller.getSellerName());
	}
}
