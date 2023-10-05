
/**
 * @author Sam Kauffman
 * @version 1.0
 *
 */
public class Application {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.Enqueue("Bill");
		queue.Enqueue("Alice");
		queue.Enqueue("Bob");
		
		queue.Dequeue();
		
		queue.Enqueue("Jane");
		queue.Enqueue("Hamad");
		
		queue.Dequeue();
		queue.Dequeue();
		
		queue.Enqueue("Jim");
		
		queue.Dequeue();
		queue.Dequeue();
		
		queue.getList();
	}

}
