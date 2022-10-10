package Handlings;

public class Finallyhandle1 {
	public static void main(String[] args) {
		int a=45,b=0,c=0;
		try {
			c=a/b;
			}
		catch(ArithmeticException e) {
			System.out.println("Error occured:"+e.getMessage());
		}
		finally
		{
			System.out.println("\n\tThe result is:"+c);
		}
		
	}

}
