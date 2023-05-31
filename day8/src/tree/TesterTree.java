package tree;

public class TesterTree {

	public static void main(String[] args) {
		Tree t = new Tree();
		t.insert(34);
		t.insert(56);
		t.insert(7);
		t.insert(15);
		System.out.println("Inorder: ");
		t.inorder(t.getRoot());
		System.out.println();
		System.out.println("Preorder: ");
		t.preorder(t.getRoot());
		System.out.println();
		System.out.println("Postorder: ");
		t.postorder(t.getRoot());
	}

}
