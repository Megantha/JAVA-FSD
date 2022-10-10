package Asistedprojects;

public class CallByValue {
	
	int num=25;
	void operation(int num) {
		this.num=num*10/100;
	}
	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		System.out.println("value of num before function call :"+obj.num);
		
		obj.operation(100);
		System.out.println("value of num after function call: "+obj.num);
		
	}

}
