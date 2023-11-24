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
		
		if(n !=null)
		{
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
			
		}
		
		
	}

}
