package Tree;

public class TreeTraverse {
	
	Node n;
	 
	public TreeTraverse(Node n) {
		this.n=n;
	}
	
	public void inorder() {
		inorder(n);
	}

	public void inorder(Node n) {
		
		if(n!=null)
		//while(n!=null)
		{
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
		}
	}
	public void preorder() {
		preorder(n);
	}

	public void preorder(Node n) {
		if(n!=null)
		{		
			System.out.println(n.data);
			inorder(n.left);
			inorder(n.right);
			
		}
}
	public void postorder() {
		postorder(n);
	}
	public void postorder(Node n) {
		if(n!=null)
		{
			inorder(n.left);
			inorder(n.right);
			System.out.println(n.data);
			//n=n.()
		}
	
	
	}
}
