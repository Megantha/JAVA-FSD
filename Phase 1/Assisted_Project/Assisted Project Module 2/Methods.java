package Asistedprojects;

public class Methods {
	//call by method
	public int cube(int n) {
		return n*n*n;
		
	}
	
	public static void main(String [] args) {
		Methods obj=  new Methods();
		
		int cube=obj.cube(10);
		System.out.println("Cube of 10 is "+cube);
		
	    }
	
	
	
	
			
		

}
