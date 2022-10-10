package Inheritance;

public class MountainBike extends Bicycle{
	private static final int startHeight = 0;
	public int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		
		seatHeight = startHeight;
	}
	public void setHeight(int newvalue)
	{
		seatHeight = newvalue;
	}
	@Override
	public String toString() {
		return(super.toString()+"\nseat of height is"+seatHeight);
	}
	
	
	

}

