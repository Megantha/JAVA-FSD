package Non_assisted;

import java.util.ArrayList;

import java.util.Scanner;


public class MailID {
	public static void valid(ArrayList<String>list) {
		System.out.println("Enter the mail ID: ");
		Scanner scanner= new Scanner(System.in);
	      String sc=scanner.next();
	      int count=0;
		
		for(String element:list) {
	    	  if(element.equals(sc)) {
	    		  count=1;
	    		  break;
	    	  }
	      }
		if(count==1)
		{
			System.out.println("The given mail id is valid");
		}
		else
		{
			System.out.println("Sorry,The given mailId is invalid.Please,Try again!");
		}
	}
	public static void main(String[] args) {
		ArrayList <String> address=new ArrayList<String>();
		  address.add("employee01@gmail.com");
	      address.add("employee02@gmail.com");
	      address.add("employee03@gmail.com");
	      address.add("employee04@gmail.com");
	      address.add("employee05@gmail.com");
	      
	      //MailIdValidate a =new MailIdValidate();
	      MailID.valid(address);
	    
	     
	}
}
	


