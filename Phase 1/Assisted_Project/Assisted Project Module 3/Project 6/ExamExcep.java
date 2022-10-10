package Handlings;

public class ExamExcep {
	
	public static void main(String[] args) {
		try {
			System.out.println("Start of try block");
			throw new MyException("This is error");
		}
		catch(MyException e){
			System.out.println("Catch block");
			System.out.println(e);
			
		}
		
	}

}
