
public class Stack {
//	int data[];
//	int top;
//	
//	public Stk(int size) {
//		data = new int[size];
//		top = -1;
//	}
//	public void push(int v) {
//		data[++top]=v;
//	}
//	public int pop() {
//		return data[top--];
//	}
	
	Node top;
	
	public Stack() {
		this.top = null;
	}
	
	public void push(int v) {
		Node nn= new Node(v);
		
		if(isEmpty()) {
			top=nn;
			return;
		}
		nn.setNext(top);
		top=nn;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("\nStack is underflow");
			return -1;
		}
		Node t=top;
		if(top.getNext()==null) {
			top=null;
//			System.out.println("\nPopped element: "+t.getData());
			return t.getData();
		}
		if(top.getNext()!=null)
//		System.out.println("\nPopped element: "+top.getData());
		top=top.getNext();
		//t.setNext(null);
		System.gc();
		return t.getData();
	}

	public boolean isEmpty() {
		if(top==null)
			return true;
		return false;
	}
	
	public void stkDisplay() {
		if(isEmpty()) {
			System.out.println("\nStack is underflow");
			return;
		}
		else {
			System.out.print("\nStack elements are: ");
			for(Node t=top; t!=null; t=t.getNext()) {
				System.out.print(t.getData()+"\t");
			}
		}
	}
}
