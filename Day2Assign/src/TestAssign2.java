
public class TestAssign2 {

	public static void main(String[] args) {
		SinglyLL S1=new SinglyLL();
		
		S1.InsertAtBeg(99);
		S1.InsertAtBeg(99);
		S1.InsertAtBeg(25);
		S1.InsertAtBeg(29);
		S1.InsertAtBeg(28);
		
		S1.CalLength();
		S1.DeleteDup();
		S1.CalLength();

	}

}
