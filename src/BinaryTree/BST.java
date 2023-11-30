package BinaryTree;

public class BST {
	BSTnode root;
	
	public BSTnode insert( int value) {
		return insert(root,value);
		
	}

	public  BSTnode insert(BSTnode node, int value) {
		
		if(node==null) {
			node=new BSTnode(value);
			if(root==null) {
				root=node;
			}
			
		}
		return node;	
	}
	
	
	
	
	
	
}
