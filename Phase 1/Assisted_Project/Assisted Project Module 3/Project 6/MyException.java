package Handlings;

public class MyException extends Exception{
	
	String a;
	MyException(String b){
		a=b;
	}
	public String toString() {
		return("MyException occured:"+a);
		
	}

}
