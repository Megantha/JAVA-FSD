package Asistedprojects;

public class Employee {
	int empId;
	String empName;
	String empDepart;
	float salary;
	
	public Employee(){
		empId=10;
		empName="Meha";
		empDepart="Testing";
		salary=35000;
		}
	public Employee(int empId,String empName,String empDepart,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.empDepart=empDepart;
		this.salary=salary;
	}
	public void disply() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Departemt: "+empDepart);
		System.out.println("Salary: "+salary);
		System.out.println();
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		Employee e1= new Employee(12,"Dheena","back office",45000);
		
		
		e.disply();
		e1.disply();
		
	}
	

}
