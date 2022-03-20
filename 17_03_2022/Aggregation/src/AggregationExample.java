/**
 * Program		: AggregationExample.java
 * @author Rachmat Purwa Saputra, 211524054
 * @since 20 March 2022
 */

import java.util.*;

class House {
	int noOfHouse;
	int numberOfRooms;
	private List<House> houses;
	
	House (int noOfHouse, int numberOfRooms)
	{
		this.noOfHouse = noOfHouse;
		this.numberOfRooms = numberOfRooms;
	}
	
	public List<House> getHouses() {
		return houses;
	}
}

class Residence {
	String residentialName;
	List<House> houses;
	
	Residence(String nameOfResidential, List<House> houses)
	{
		this.residentialName = nameOfResidential;
		this.houses = houses;
	}
	
	public int countTotalHousesInResidence() {
		int noOfHouses = 0;
		
		for (House h : houses) {
			noOfHouses++;
		}
		
		return noOfHouses;
	}
}

public class AggregationExample {
	public static void main(String[] args) {
		House h1 = new House(163, 8);
		House h2 = new House(16, 5);
		House h3 = new House(10, 4);
		
		List<House> all_houses = new ArrayList<House>();
		all_houses.add(h1);
		all_houses.add(h2);
		all_houses.add(h3);
		
		Residence Res = new Residence("Nuansa Indah", all_houses);
		
		System.out.print("Total rumah ada ");
		System.out.println(Res.countTotalHousesInResidence());
	}
}
