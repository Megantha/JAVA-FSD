package Phase1FinalProject;

import java.util.Scanner;

public class VirtualKey {
	
	public static void main(String[] args) {
		int a=0,choice=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\t********\n");
		System.out.println("\t Welcome to Virtual Key Repository! ");
		System.out.println("\t By Meha Solutions\n");
		System.out.println("\t********");
		System.out.println(" Developer\t: Megantha P\n Company\t: Meha e-Solutions \n");
		
		while(true)
		{
			System.out.println("Enter your choice which you want to select");
			System.out.println("1. Retrieve the current file in ascending order");
			System.out.println("2. Business level Operations menu");
			System.out.println("3. Exit from the Program");
			try{    
				a = scanner.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }   
			switch(a)
			{
			case 1: //List function feature to list all files in ascending order.
				BusinessOperations.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose one of the following options :");
					System.out.println("1. Add a File to the directory");
					System.out.println("2. Delete a File from directory");
					System.out.println("3. Search for a File");
					try{    
						 choice = scanner.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					case 1:
						
						System.out.println("Enter the name of a file to be created: ");
						String fileCreate = scanner.next();
						BusinessOperations.createFile(fileCreate);
						break;
						
					case 2:
						
						System.out.print("Enter the name of a file to be deleted: ");
						String fileDelete = scanner.next();
						BusinessOperations.deleteFile(fileDelete);
						break;
						
					case 3:
						
						System.out.println("Enter the name of a file to be searched: ");
						String fileSearch = scanner.next();
						BusinessOperations.searchFile(fileSearch);
						break;
						
				default:
						
						System.out.println("\n Oh no! Invalid Input,Please,Try again\n");
						break;
				}
			
					break;
			case 3:
				
				
				scanner.close();
				System.out.println("\n Thanks for using this application.It was a nice experience with you here! See you again. Good bye... and take care");
				System.exit(1);
				break;
			
			default:
				
				System.out.println("\n\n Opps! Invalid Input, Please select the range between 1-3\n");
				break;
			
			}
			
		}
    }
}

