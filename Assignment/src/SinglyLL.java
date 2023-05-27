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
	
	public boolean calcLength()
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
			System.out.print(temp.getData()+"\t");
			temp=temp.getNext();
			
		}
		System.out.print("length ="+counter);
		return true;
	}
	
	public boolean deleteDup()
	{
		if(head==null)
		{
			return false;
		}
		Node temp1=head;
		Node temp2=null;
		
		while(temp1!=null && temp1.getNext()!=null)
		{	
			temp2=temp1;
			while(temp2.getNext()!=null) {
				
				if(temp1.getData()==temp2.getNext().getData()) {
					temp2.setNext(temp2.getNext().getNext());
					System.gc();
					System.out.println("\nDeleted "+temp1.getData());
				}
				else {
					temp2=temp2.getNext();	
				}
			}
			temp1=temp1.getNext();
		}		
		return true;
	}
	
	public boolean midElement() {
		if(head==null) {
			return false;
		}
		int count=0;
		Node temp=head;
		Node temp2=head;
		while(temp!=null) {
			temp=temp.getNext();
			count++;
		}
		System.out.println("\nTotal elements:"+count);
		if(count%2==0) {
			count=count/2;
			System.out.println("\nMid elements' positions:"+count+" & "+(count+1));
			for(int i=1; i<=count;i++) {
				temp2=temp2.getNext();
				i++;
			}
			System.out.println("\nMid elements:"+temp2.getData()+" "+temp2.getNext().getData());

		}
		else {
			count=count/2+1;
			System.out.println("\nMid element position:"+count);
			for(int i=0; i<=count;i++) {
				temp2=temp2.getNext();
				i++;
			}
			System.out.println("\nMid element:"+temp2.getData());

		}
		return true;
	}
	
	public boolean checkCycle(int n) {
		
		Node temp=head;
		for(int i=0;i<n;i++) {
			temp=temp.getNext();
			if(temp.getNext()==null) {
				System.out.println("\nNot circular");
				return true;
			}
		}
		System.out.println("\nCircular");
		while(temp!=null) {
			temp=temp.getNext();
			if(temp.getNext()==head) {
				System.out.println("First element: "+temp.getNext().getData());
				return true;
			}
		}
		return true;
	}
	
	public boolean checkPalin() {
		Node temp=head;
//		Node temp2=head;
		Stack s= new Stack();
		int i;
		boolean flag=true;
		
		
		
		while(temp!=null) {
			s.push(temp.getData());
			temp=temp.getNext();
		}
		
		while(head!=null) {
			i=s.pop();
			if(head.getData()==i) {
				flag=true;
			}
			else {
				System.out.println("\nNot a palindrome");
				flag=false;
				break;
			}
			head=head.getNext();
		}
		if(flag==true) {
			System.out.println("\nPalindrome");
		}
		return true;	
	}
	
}
