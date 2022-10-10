package Asistedprojects;

public class Typecasting {
	
	public static void main(String[] args) {
		System.out.println("IMPLICIT CASTING\n");
		char a='M';
		System.out.println("value of a:"+a);
		int b=a;
		System.out.println("value of b:"+b);
		float c=a;
		System.out.println("value of c:"+c);
		double d=a;
		System.out.println("value of d:"+d);
		long e=a;
		System.out.println("value of e:"+e);
		System.out.println("\n");
		
		System.out.println("EXPLICIT CASTING\n");
		
		double x= 90.5;
		int y= (int)x;
		System.out.println("value of x:" +x);
		System.out.println("value of y:" +y);
	}

}
