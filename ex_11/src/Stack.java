import java.util.ArrayList;
public class Stack {
	ArrayList<Integer> StackArray;
	
	public Stack() {
		StackArray = new ArrayList<Integer>();
	}
	
	public Integer peek() {
		return StackArray.get(StackArray.size()-1);
	}
	
	public void push(Integer data) {
		StackArray.add(data);
	}
	
	public String toString() {
		return "Stack  [StackArray=" + StackArray + "]";
	}

	public void pop() {
		if(StackArray.size()-1 < 0)
			System.out.println("\nThe stack is empty");
		else {
			StackArray.remove(StackArray.size()-1); 
		}
	}
}
