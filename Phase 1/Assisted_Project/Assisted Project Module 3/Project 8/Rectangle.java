package Abstraction;

public class Rectangle extends Shape {
	
	
	private double length;
	private double width;
	public Rectangle( String color,double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length*width;
	}

	@Override
	public String toString() {
		return "Rectangle colour:"+getColour()+" and Area is:"+area();
	}

	
	
	

}
