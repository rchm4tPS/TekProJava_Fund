
public class TestClass {
	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape);
		
		Shape shape2 = new Shape("red", false);
		System.out.println(shape2);
		
		Square sq1 = new Square(5, "Purple", true);
		System.out.println(sq1);
		
		System.out.println(sq1.getPerimeter()+ " " + sq1.getArea());
	}
}
