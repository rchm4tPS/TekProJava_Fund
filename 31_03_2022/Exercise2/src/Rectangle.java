
public class Rectangle extends Shape {
	public double width;
	public double length;
	
	// Constructors
	public Rectangle() {
		super();
		this.width = this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super.color = color;
		super.filled = filled;
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width=" + this.width + "and\r\n"
				+ "length=" + this.length + ", which is a subclass of "
				+ super.toString();
	}
}
