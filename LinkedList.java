/**
 * @author njohnson3
 * @version 1.0
 *
 */
public class LinkedList {
	
	Node head;
	int length;
	Node tail;
	
	
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	/**
	 * @return true if empty, false if items
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	/**
	 * @return the head of the list
	 */
	public Node getList()
	{
		return head;
	}
	/**
	 * @param aNode, adds it into the list
	 */
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
	
	/**
	 * @return the length of the list
	 */
	public int getLength() {
		return length;
	}

}
