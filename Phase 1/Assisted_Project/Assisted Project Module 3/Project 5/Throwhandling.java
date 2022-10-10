package Handlings;

public class Throwhandling {
	void Division() throws ArithmeticException
	{
		int a=45;
		int b=0;
		int c=0;
		c=a/b;
		System.out.println("\n\tThe result is :"+c);
	}
	public static void main(String[] args) {
		Throwhandling t1=new Throwhandling();
		
		try
		{
			t1.Division();
		}
		catch(Exception e) {
			System.out.println("\n\tThrows exception :"+e.getMessage());
		}
	}

}
