package MultithreadingExam;

public class SleepWaitExam {
	private static Object LOCK = new Object();
	public static void main(String args[]) {
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is woke after"+" 2 second of sleep");
			
			synchronized (LOCK){
				LOCK.wait(3000);
				System.out.println("Object is woke up after 3 seconds");
			} 
			
		}catch (InterruptedException e) {
				
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Error occured:"+e);
		}
}
}

