/**
 * Program		: CompositionExample.java
 * @author Rachmat Purwa Saputra, 211524054
 * @since 20 March 2022
 */

import java.util.*;

class Bicycle {
	private String bicycleMerk;
	
	Bicycle (String merk)
	{
		this.bicycleMerk = merk;
	}
	
	public String getBicycleMerk() {
		return this.bicycleMerk;
	}
	
	public void setBicycleMerk(String newMerk) {
		this.bicycleMerk = newMerk;
	}
}

class BicycleWheel {
	private final int numOfWheel = 2;
	
	public int getNumOfWheel() {
		return numOfWheel;
	}
}

public class CompositionExample {
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle("United Bike");
		Bicycle b2 = new Bicycle("Polygon");
		Bicycle b3 = new Bicycle("Pacific");
		
		BicycleWheel roda = new BicycleWheel();
		
		List<Bicycle> sepeda = new ArrayList<Bicycle>();
		sepeda.add(b1);
		sepeda.add(b2);
		sepeda.add(b3);
		
		for (Bicycle spd : sepeda) {
			System.out.print("Merk : " + spd.getBicycleMerk());
			System.out.println(" dengan jumlah roda " +roda.getNumOfWheel());
		}
	}
}
