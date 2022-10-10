package Asistedprojects;

public class ArrayAssist {
	public static void main(String[] args) {
		
		//single-dimensional array
		int i;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(i=0;i<10;i++) {
			System.out.println("Elements of array a:"+a[i]);
		}
		
		//multi-dimensional Array
		int[][] b= {
				{5,4,10,125},
				{3,4,5}};
				System.out.println("\nLength of row1: "+b[0].length);
				System.out.println("\nLength of row2: "+b[1].length);
		
	}

}
