package tree;

public class Node {
	private int data;
	private Node lchild, rchild;
	

	public Node(int data) {
		this.data = data;
		this.lchild = null;
		this.rchild = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLchild() {
		return lchild;
	}

	public void setLchild(Node lchild) {
		this.lchild = lchild;
	}

	public Node getRchild() {
		return rchild;
	}

	public void setRchild(Node rchild) {
		this.rchild = rchild;
	}
	
	
}
