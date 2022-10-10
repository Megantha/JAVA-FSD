package Asistedprojects;

public class innerClassAssist2 {
	private String a="Java";
	void display() {
		class inner{
			void a() {
				System.out.println(a);
			}
		}
		inner b=new inner();
		b.a();
	}
	public static void main(String[] args) {
		innerClassAssist2 o=new innerClassAssist2();
		o.display();
	}
	

}
