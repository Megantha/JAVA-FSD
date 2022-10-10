package MultithreadingExam;

public class TestEmployeeEncaps {
	
	public static void main(String[] args) {
		EmployeeEncaps s1= new EmployeeEncaps();
		s1.setId(1);
		s1.setName("Java");
		s1.setEmail("java@gmail.com");
		s1.setPassword("JAVA123");
		s1.setDesignation("A");
		s1.setMobile("1234567890");
		
		System.out.println("Id:"+s1.getId()+"\nName:"+s1.getName()+"\nEmail:"+s1.getEmail()+"\nPassword:"+s1.getPassword()+"\nDesignation:"+s1.getDesignation()+"\nMobile number:"+s1.getMobile());
		
	}
	
	
	
	
	
	

}
