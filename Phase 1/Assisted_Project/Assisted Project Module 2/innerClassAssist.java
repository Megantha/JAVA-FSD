package Asistedprojects;

public class innerClassAssist {
	
	private String msg="Hello World";
	
	class inner{
		void hello() {System.out.print(msg+",Learning Java language");}
	}
		public static void main(String[] args) {
			innerClassAssist obj=new innerClassAssist();
			innerClassAssist.inner n=obj.new inner();
			n.hello();
			
		}

}
