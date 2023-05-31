package tree;

public class Tree {
	private Node root;
	

	public Tree() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int v) {
		Node nn = new Node(v);
		if(nn==null) {
			return false;
		}
		if(root==null) {
			root=nn;
			return true;
		}
		Node t=root;
		Node par;
		while(t!=null) {
			par=t;

			if(v>t.getData()) {
				t=t.getRchild();
			}
			else {
				t=t.getLchild();
			}
			if(t==null) {
				if(v>par.getData()) {
					par.setRchild(nn);
				}
				else {
					par.setLchild(nn);
				}
			}
		}	
		return true;
	}
	
	public void inorder(Node t) {
		if(t==null) {
			return;
		}
		inorder(t.getLchild());
		System.out.print(t.getData()+"\t");
		inorder(t.getRchild());
	}
	
	public void preorder(Node t) {
		if(t==null) {
			return;
		}
		System.out.print(t.getData()+"\t");
		preorder(t.getLchild());
		preorder(t.getRchild());
	}
	
	public void postorder(Node t) {
		if(t==null) {
			return;
		}
		postorder(t.getLchild());
		postorder(t.getRchild());
		System.out.print(t.getData()+"\t");
	}
}
