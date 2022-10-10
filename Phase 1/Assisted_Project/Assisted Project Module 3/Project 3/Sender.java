package MultithreadingExam;

public class Sender {
	
	void send(String msg) {
		System.out.println("Sending msg...."+msg);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error while sending"+e);
		}
		
		System.out.println("message sent successfully");
	}

}
