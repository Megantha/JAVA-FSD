package Asistedprojects;

abstract class AnonymousInnerClass{
	public abstract void display();
}

public class innerClassAssist3 {
	public static void main(String[] args) {
		AnonymousInnerClass a= new AnonymousInnerClass() {
			public void display() {
				System.out.println("Anonymous inner Class");
			}
			
		};
		a.display();
	}

}
