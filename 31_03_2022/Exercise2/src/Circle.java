
public class Circle extends Shape {
	public double radius;
	
	// Constructors
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super.color = color;
		super.filled = filled;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius; 
	}
	
	@Override
	public String toString() {
		return "A Circle with radius=" + this.radius + ", which is\r\n"
				+ "a subclass of " + super.toString();
	}
}
