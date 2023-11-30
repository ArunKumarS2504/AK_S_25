package BinaryTree;

public class Example {
	
	TreeNode root;
	
	public Example(TreeNode n) {
		
		this.root=null;
	}
	
	public static boolean root1=false;
	
	public void TreeNode() {
		root=null;
		
	}
	public void searchNode(TreeNode temp, int value){  
        
        if(root == null){  
          System.out.println("Tree is empty");  
        }  
        else{  
          
          if(temp.data == value){  
            root1 = true;  
               return;  
          }  
	
        }
        
        if(root1 == false && temp.left != null){  
            searchNode(temp.left, value);  
         }  
        
         if(root1 == false && temp.right != null){  
            searchNode(temp.right, value);  
         }  
	}
}



