/**
 * Program		: DependenceExample.java
 * @author Rachmat Purwa Saputra, 211524054
 * @since 20 March 2022
 */

class Book {
	int pageNumber = 10;
	
	public void setPageNumber() {
		(this.pageNumber)++;
	}
	
	public int getPageNumber() {
		return this.pageNumber;
	}
}

class Student {
	public void turnAPage (Book b) {
		b.setPageNumber();
		System.out.println("S/he has turn his/her page. Now, at page " + b.getPageNumber());
	}
}

public class DependenceExample {
	public static void main(String[] args) {
		Book HarryPotter = new Book();
		Student std1 = new Student();
		
		std1.turnAPage(HarryPotter);
		
	}
}
