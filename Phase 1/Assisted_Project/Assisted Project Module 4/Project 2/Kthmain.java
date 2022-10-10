package ArrayRotateExam;

public class Kthmain {
	
	public static void main(String[] args) {
		
		KthSmallElement2 a=new KthSmallElement2();
		
		int arr[]= {28,16,46,38,55,89,83,30};
		
		int left=0;
		int n=arr.length;
		int right=n-1;
		int k=5;
		
		System.out.println("The Kth Smallest Element :"+a.KthSmallElmenet2(arr,left,right,k));
	}

}
