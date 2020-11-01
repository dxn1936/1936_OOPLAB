import java.util.ArrayList;

public class Queue {
	Integer data;
	ArrayList<Integer> queue;

	public Queue() {
		queue = new ArrayList<Integer>();
	}
	
	public void enqueue(int data) {
		queue.add(data);
	}
	
	public void display() {
		System.out.println(queue);
	}
	
	public Integer dequeue() {
		if(queue.size()==0)
			System.out.println("Queue is empty");
		else {
			data = queue.get(0);
			queue.remove(queue.get(0));
		}
		
		return data;
	}
}
