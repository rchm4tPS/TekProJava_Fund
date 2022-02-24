/**
 * <h1> Item Class </h1>
 * 
 * This Item Class contains one constructor and one method to print the value
 * contained in local variable called name that its access modifier has been set 
 * to private.
 * 
 * @author Rachmat Purwa Saputra / 211524054
 * @since 24-02-2022
 * @version 1.0
 *
 */

public class Item {
	/* Instance variables and Item constructor, both are set as private */
	private String name;
	private Item() {
		name = "Ipin";
	}
	
	/* Method Item */
	public Item(String name) {
		/* At first, "name" variable doesn't have any value corresponding to it.
		 * We use constructor Item() locally within this method, then
		 * the "name" variable will have value "Ipin" after that. */
		System.out.println(this.name = new Item().name.toLowerCase());  // set to lower case
	}
}
