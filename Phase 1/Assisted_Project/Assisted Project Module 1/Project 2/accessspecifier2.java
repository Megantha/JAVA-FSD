package Asistedprojects;

class privateAccess
{
	private void display() {
		System.out.println("This is Private Access Specifier");
		
	}


}

public class accessspecifier2 {
	
	public static void main(String[] args) {
		
		System.out.println("Private Access specifier");
		privateAccess o = new privateAccess();
		
	}

}
