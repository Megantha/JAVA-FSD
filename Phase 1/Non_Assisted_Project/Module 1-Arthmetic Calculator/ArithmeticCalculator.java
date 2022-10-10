package Non_assisted;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		
	    char operator ;
	
        Scanner number = new Scanner(System.in);
        
		System.out.println("Enter the number 1 :");
    	int a= number.nextInt();
    	
	    System.out.println("Enter the number 2 :");
	    int b= number.nextInt();
	    
	
	   	System.out.println("Choose an operator to arthimetic calculation : +,-,*, /,or%");
	   	operator = number.next().charAt(0);
	   
	   	
	    switch(operator)
	    	{
	    	case '+':
	    		
	    		
	    		System.out.println("Addition of two numbers is:"+(a+b));
	    		break;
	    		
	    	case '-':
	    	
	    		
	    		System.out.println("subtraction of two numbers is:"+(a-b));
	    		break;
	    	case '*':
	    		
	    	
	    		System.out.println("Multiplication of two numbers is:"+(a*b));
	    		break;
	    	case '/':
	    		
	    	
	    		System.out.println("Division of two numbers is:"+(a/b));
	    		break;
	    		
            case '%':
            	
            
	    		System.out.println("Modulus of two numbers is:"+(a%b));
	    		break;
	    	
	    	
	    		
	        default:
	    		System.out.println("Invalid operator");
	    		
	    	
	    		
	    	}
		
	}

}
