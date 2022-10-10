package Asistedprojects;

class defAccessSpecifier
{
	void display()
	{
		System.out.println("Default access Specifier");
	}
}

public class accessspecifer1 {
	
	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();
		
	}

}
