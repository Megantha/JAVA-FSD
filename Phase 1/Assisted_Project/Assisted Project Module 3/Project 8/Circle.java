package Abstraction;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius, String colour) {
		super(colour);
		this.radius = radius;
	}
	
	double area() {
		
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle colour:"+getColour()+" and area is :"+area();
	}
	
	
	
	


	

}
