
public class MainApp {
public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("***Stack***");
		System.out.println("The elements entered in "+stack);
		
		stack.pop();
		System.out.println(stack.peek());
		stack.push(5);
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.pop();
		
	
		Queue q = new Queue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println("\n***Queue***");
		System.out.println("The elements entered in queue");
		q.display();
		
		System.out.println(q.dequeue());
		
		q.display();
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.dequeue();
		
	}

}
