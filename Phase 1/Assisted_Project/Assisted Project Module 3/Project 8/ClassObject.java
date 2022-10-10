package MultithreadingExam;

public class ClassObject {
	 int id;
	 String name;
	 String email;
	 String password;
	 String designation;
	 String mobile;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	@Override
	public String toString() {
		return("Id :"+this.getId()+"\nName:"+this.getName()+"\nEmail:"+this.getEmail()+"\nPassword:"+this.getPassword()+"\nDesignation:"+this.getDesignation()+"\nNumber:"+this.getMobile()+".");
	}
	 
	 public static void main(String[] args) {
		 ClassObject t1= new ClassObject();
		 System.out.println(t1.toString());
	 }

}
