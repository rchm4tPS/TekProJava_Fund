
public class Square extends Rectangle {
	// Constructors
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.length;
	}
	
	public void setSide(double side) {
		super.length = super.width = side;
	}
	
	public void setLength(double side) {
		super.length = side;
		super.width = side;
	}
	
	public void setWidth(double side) {
		super.width = side;
		super.length = side;
	}
	
	@Override
	public String toString() {
		return "A Square with side=" + super.width + ", which is a subclass of"
				+ super.toString();
	}
}
