/**
 * @author njohnson3
 * @version 1.0
 *
 */
class Node {
	String data;
	Node nextNode;
	public Node()
	{
		nextNode=null;
		data="";
	}
	/**
	 * @param data
	 */
	public void setData(String data) {
		this.data=data;
	}
	/**
	 * @return Node
	 */
	public Node getNode() {
		return this;
	}
	/**
	 * @param nextNode
	 */
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}
