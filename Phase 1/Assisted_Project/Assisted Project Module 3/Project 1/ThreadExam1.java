package MultithreadingExam;

public class ThreadExam1 extends Thread {
	
	public void run() {
		System.out.println("Thread activated");
	}
	
	public static void main(String args[]) {
		ThreadExam1 t=new ThreadExam1();
		ThreadExam1 t2=new ThreadExam1();
		
		t.start();
		t2.start();
	}

}
