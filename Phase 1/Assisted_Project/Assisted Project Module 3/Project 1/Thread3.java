package MultithreadingExam;

public class Thread3 implements Runnable {
	
	public static int mycount=0;
	
	public Thread3(){
		
	}

	@Override
	public void run() {
		
		while(Thread3.mycount <=5) {
			try {
				System.out.println("Thread :"+(++Thread3.mycount));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Excaption in thread 3"+e);
			}
		}
		
		
	}
	public static void main(String[] args) {
		Thread3 ins = new Thread3();
		
		Thread t=new Thread(ins);
		t.start();
		while(Thread3.mycount <=5) {
			try {
				System.out.println("Theard1 :"+(++Thread3.mycount));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Exception in thread :"+e);
				
			}
		}
		
		
	}
	

}
