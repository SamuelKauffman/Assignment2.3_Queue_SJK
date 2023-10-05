
/**
 * @author sam Kauffman 
 * @version 1.0
 *
 * @param <T>
 */
public class Queue<T> {

	private LinkedList list;
	
	public Queue() {
		list = new LinkedList();
	}
	
	/**
	 * @param item, takes in item and adds it to the back of the queue
	 */
	public void Enqueue(String item) {
		Node aNode = new Node();
		aNode.setData(item);
		list.addNode(aNode);
	}
	
	/**
	 * @return the item removed from the queue
	 */
	public String Dequeue() {
		if(list.isEmpty()) {
			System.out.println("There is nothing to remove.");
			return null;
		}
		Node firstNode = list.getList();
		list.head = firstNode.nextNode;
		list.length--;
		return firstNode.data;
		
	}

	/**
	 * prints every item in the queue
	 */
	public void getList() {
		Node currentNode = list.getList();
		while(currentNode != null) {
			System.out.println(currentNode.data + "");
			currentNode = currentNode.nextNode;
		}
	}
}
