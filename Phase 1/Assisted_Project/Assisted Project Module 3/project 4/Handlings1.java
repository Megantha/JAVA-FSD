package MultithreadingExam;

public class Handlings1 {
	
	public static void main(String[] args) {
		
		int[] array=new int[3];
		try {
			array[7]=3;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds!"+e);
		}
		finally {
			System.out.println("The array of size"+array.length);
		}
	}

}
