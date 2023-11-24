package Tree;

public class Maintree {
	public static void main(String arg[]) {
		
		Node n= new Node(10);	
		n.left=new Node(20);
		n.right=new Node(30);
		n.left.left=new Node(40);
		n.left.right=new Node(50);
		n.right.left=new Node(60);
		n.left.left.left=new Node(70);
		
		TreeTraverse root= new TreeTraverse(n); 
		root.inorder();
		
		
		
	}

}
