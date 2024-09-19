package HEAP;

public class Heapnode {
	
	int data;
	Heapnode left;
	Heapnode right;
	
  
 
   public Heapnode(int data) {
	   
	   this.data=data;
	   
   }
   public int getData() {
	   return data;
   }
   public Heapnode getLeft() {
	return left;

   }
   public Heapnode getRight() {
	return right;

   
   }
   public void setData(int data) {
	this.data = data;

   }
   public void setLeft(Heapnode left) {
	this.left = left;
   
   }
   
   public void setRight(Heapnode right) {
	this.right = right;
   
   }
   
}