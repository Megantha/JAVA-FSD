package Abstraction;

public abstract class Shape {
	
	private String colour;
	
	abstract double area();

	public Shape(String colour) {
		System.out.println("Constructor called");
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	
	
}
