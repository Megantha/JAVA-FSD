package MultithreadingExam;

public class Testsynchronize {
	
	public static void main(String[] args) {
		
		Sender sender=new Sender();
		
		user t1=new user("Java","Hello....",sender);
		user t2=new user("world","How are you",sender);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Interrupted");
		}
	}

}
