package Tree;

public class HeightOFTree {
	
	int data ;
	HeightOFTree left,right;
	
	
	HeightOFTree(int item ){
		 
		data = item;
		left=right=null;
		
	}
}
	
	class Btree {
		
		HeightOFTree root;
		
	public int dia(HeightOFTree node) {
			if(node==null) {
				return 0;
			}
			
			else {
				
				int leftheight=height(node.left);
				 int rightheight=height(node.right);
				 
				 int leftdia =dia(node.left);
				 int rightdia =dia(node.right);
				 
				 return Math.max((leftheight+rightheight+1) ,Math.max(leftdia, rightdia));
			}
			
	}
			
			
	public int height(HeightOFTree node) {
				 if(node==null) {
					 return 0;
				 }
				 else {
				 int leftheight=height(node.left);
				 int rightheight=height(node.right);
				
				 return Math.max(leftheight, rightheight +1);
			
				 }
				
		}
	
	public HeightOFTree findLCA(HeightOFTree node, HeightOFTree p, HeightOFTree q) {
        if (node == null || node == p || node == q) {
            return node;
        }

        HeightOFTree left = findLCA(node.left, p, q);
        HeightOFTree right = findLCA(node.right, p, q);

        if (left != null && right != null) {
            return node;
        }

        return (left != null) ? left : right;
    }
		
	
	public int distance(HeightOFTree root,HeightOFTree node ,int distance) {
		
		if(root==null) {
		    return -1;	
		}
		if(node==root) {
			return distance;
		}
		int leftdistance= distance(root.left,node,distance+1);
		int rightdistance= distance(root.right,node,distance+1);
		
		if (leftdistance != -1) {
            return leftdistance;
        }

        return rightdistance;
    }
		
		
	
			
      public static void main(String[] args)
			    {
			        Btree tree = new Btree();
			 
			        tree.root = new HeightOFTree(20);
			        tree.root.left = new HeightOFTree(10);
			        tree.root.right = new HeightOFTree(30);
			        tree.root.left.left = new HeightOFTree(5);
			        tree.root.left.right = new HeightOFTree(15);
			        tree.root.right.left = new HeightOFTree(25);
			        tree.root.right.right = new HeightOFTree(35);
			 
//			        System.out.println("Height of tree is " + tree.height(tree.root));
//			                          
//			    System.out.println(tree.dia(tree.root));
			    
			    HeightOFTree p = tree.root.left.left; 
		        HeightOFTree q = tree.root.right.right;
//
//		        HeightOFTree lca = tree.findLCA(tree.root, p, q);
//
//		        if (lca != null) {
//		            System.out.println("Lowest Common Ancestor: " + lca.data);
//		        } else {
//		            System.out.println("No Common Ancestor found.");
//		        }
		        
		       // if(distance!=null) {
		        	
		        	
		        	
		        }
//			
			
		}


	
		
		
		
	
	
	

