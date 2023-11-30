package BinaryTree;



public class TreeNode {
	
	
	int data;
	 TreeNode right;  
	 TreeNode left;
	
	TreeNode(int data){
		
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public static void main(String arg[]) {
		
		
	 
		TreeNode root= new TreeNode(21);
		root.left=new TreeNode(9);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(23);
		root.left.left.left=new TreeNode(12);
		root.left.left.right=new TreeNode(13);
		root.left.right=new TreeNode(18);
		root.right.left=new TreeNode(7);
		root.right.left.left=new TreeNode(17);
		root.right.right=new TreeNode(16);
		root.right.right.left=new TreeNode(15);
		root.right.right.left.left=new TreeNode(11);
		
//		TreeNode.searchNode(,6);
		
	   if(root != null) {
		   System.out.println();
	   }
	}

}
