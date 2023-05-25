
public class SinglyLL {

	Node head;

	public SinglyLL() {
		this.head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void InsertAtBeg(int value) {
		Node Newnode=new Node(value);
		if(head==null)
		{
			head=Newnode;
		}
		else {
			Newnode.setNext(head);
			head=Newnode;
		}
		
	}
	
	public boolean CalLength()
	{
		if(head==null)
		{
			return false;
		}
		Node temp =head;
		int counter=0;
		while(temp!=null)
		{
			counter++;
			System.out.print("\t"+temp.getData());
			temp=temp.getNext();
			
		}
		System.out.println("\t length ="+counter);
		return true;
	}
	
	public boolean DeleteDup()
	{
		if(head==null)
		{
			return false;
		}
		Node temp=head;
		
		while(temp.getNext()!=null)
		{
			Node t=head;
			while(t.getNext()!=null)
			{
			if(temp.getData() == t.getNext().getData())
				{
					t.setNext(t.getNext().getNext());
					t.getNext().setNext(null);
					System.out.println("deled");
				}
				t=t.getNext();
			}
			temp=temp.getNext();
		}
		
		return true;
	}
	
}
