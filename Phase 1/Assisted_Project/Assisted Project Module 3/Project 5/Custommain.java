package Handlings;

class MyException extends Exception
{
	public MyException(String s) {
		super(s);
	}
}

public class Custommain {
	public static void main(String[] args) {
		try {
			throw new Exception("temp");
		}
		catch(Exception e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}

}
