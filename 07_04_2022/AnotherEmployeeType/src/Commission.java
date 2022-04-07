
//*************************************************
//  Commission.java		Created by : Rachmat PS
//
//  Extending from Hourly Class
//*************************************************

public class Commission extends Hourly {
	double totalSalesMade;
	double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone,
					  String socSecNumber, double rate, double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSalesMade += totalSales;
	}
	
	public double pay() {
		double incremented = super.pay() + totalSalesMade * (1.0 + commissionRate);
		
		totalSalesMade = 0;
		
		return incremented;
	}
	
	public String toString() {
		String res = super.toString();
		
		res += "\nThis employee receive commission";
		
		res += "\nThe commission's percentage is ";
		
		res += this.commissionRate;
		
		return res;
	}
}
