package Inheritance;

public class Bicycle {
	
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreake(int decrement)
	{
		speed-=decrement;
	}
	public void speedUp(int increment)
	{
		speed+=increment;
	}
	@Override
	public String toString() {
		return("No of gears are"+gear+"\nSpeed of bicycle is:"+speed);
	}
	
	
}
