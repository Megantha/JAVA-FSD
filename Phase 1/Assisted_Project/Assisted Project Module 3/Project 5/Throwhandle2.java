package Handlings;

public class Throwhandle2 {
	
	public static void main(String[] args) {
		
		int a=45;
		int b=0;
		int c=0;
		
		try {
			if(b==0)
				throw( new ArithmeticException("Can't divide by zero"));
			else
			{
				c=a/b;
				System.out.println("The result is:"+c);
			}
		}
			catch(ArithmeticException e) {
				System.out.println("Error occured :"+e.getMessage());
				
			
			
		}
	}

	private static Exception ArithmeticException(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
