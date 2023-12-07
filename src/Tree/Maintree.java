package Tree;

public class Maintree {
	public static void main(String arg[]) {
		
		Node n=new Node (38);
		 n.left=new Node(27);
		 n.right=new Node(25);
		 n.left.left=new Node(20);
		 n.left.right=new Node(18);
		 n.left.right.left=new Node(28);
		 n.left.left.right=new Node(24);
		 n.left.left.left=new Node(55);
		 n.right.left=new Node(45);
		 n.right.left.left=new Node(39);
		 n.right.left.right=new Node(8);
		 n.right.left.right.right=new Node(12);
		 n.right.left.right.right.left=new Node(9);
		 n.right.right=new Node(32);
		 n.right.right.left=new Node(13);
		 n.right.right.right=new Node(16);
		 n.right.right.right.right=new Node(4);
		 n.right.right.right.left=new Node(6);
		
		 TreeTraverse Root=new TreeTraverse(n);
		 System.out.println( " In Order");
		 Root.inorder();
		 System.out.println(" Pre Order");
		 Root.preorder();
		 System.out.println(" Post Order");
		 Root.postorder(); 
		 

		
		
	}
}
