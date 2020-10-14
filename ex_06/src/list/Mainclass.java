package list;

public class Mainclass {
	public static void main(String args[])
	{
	
		Node link = new Node(2);
		Node.addNode(2,link);
		Node.print(link);
		Node.findLength(link);
	}
}
