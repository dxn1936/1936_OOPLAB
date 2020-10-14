package list;

public class Node 
{

	public	Integer data;
	public	Node next;
		
	Node(Integer a)
	{
		data=a;
		next=null;
	}
			
	static public void addNode(Integer num,Node node)
	{
		node.next = new Node(num);
	}
	static public void findLength(Node node)
	{
		Integer len=0;
			
		while(node!=null)
		{
			len++;
			node=node.next;
		}
			
		System.out.println("\nLength of the list is "+len);
	}
		
	static public void print(Node node)
	{
		System.out.println("The list displayed is :- ");
		while(node!=null)
		{
				
			System.out.print(node.data +" ");
			node=node.next;
		}
	}
}
