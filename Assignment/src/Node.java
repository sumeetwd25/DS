
public class Node {

	int data;
	Node Next;
	Node Prev;
	
	
	public Node(int data) {
		
		this.data = data;
		this.Next = null;
		this.Prev = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return Next;
	}


	public void setNext(Node next) {
		Next = next;
	}
	
	public Node getPrev() {
		return Prev;
	}

	public void setPrev(Node prev) {
		Prev = prev;
	}

}
