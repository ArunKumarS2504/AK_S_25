package HEAP;

public class HeapLogic {
	
	int[] heap;
	int maxsize;
	int size;
	
	
	public HeapLogic(int maxsize) {
		this.maxsize=maxsize;
		heap[0]=6789;
		this.size=0;
	}
	
	public int parentPos(int pos) {
		return pos/2;
	
	}
	
	public int leftChild(int pos) {
		return pos*2;
		
	}

	public int rightChild(int pos) {
		return pos*2+1;
	}
	
	public void insert(int val) {
	    size=size+1;
	    heap[size] = val;
	}
	
	public void print() {
		for(int i=1;i<heap.length/2+1;i++) {
			System.out.println(heap[i]);
			
//			if(max)
			
		}
	}
}
