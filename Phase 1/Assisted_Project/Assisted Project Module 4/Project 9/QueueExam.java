package Matrix;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExam {
	public static void main(String[] args) {
		Queue<String> locationQueue= new LinkedList<String>();
		
		locationQueue.add("India");
		locationQueue.add("China");
		locationQueue.add("Japan");
		locationQueue.add("Russia");
		locationQueue.add("Indonesia");
		locationQueue.add("US");
		
		System.out.println("Queue is : "+locationQueue);
		
		
		//find head of queue
		System.out.println("Head of Queue: "+locationQueue.peek());
		
		locationQueue.remove();
		
		System.out.println("After Removing Head: "+locationQueue);

}
}
