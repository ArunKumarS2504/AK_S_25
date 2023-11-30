package BinaryTree;

public class BSTnode {
	int data;
	BSTnode left;
	BSTnode right;
	
	public BSTnode(int newdata) {
		this.data=newdata;
	}
	
	
	public int getData() {
		return data;
	}
	
	public BSTnode getLeft() {
		return left;
	}
	public BSTnode getRight() {
		return right;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(BSTnode left) {
		this.left = left;
	}
	public void setRight(BSTnode right) {
		this.right = right;
	}

}
