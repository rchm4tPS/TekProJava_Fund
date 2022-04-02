
public class Shape {
	public String color;
	public boolean filled;
	
	// Constructors
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		if(this.filled == true) {
			return "A Shape with color of " + this.color+ " and filled";
		} else {
			return "A Shape with color of " + this.color+ " and not filled";
		}
	}
	
}
