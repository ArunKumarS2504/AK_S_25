package Practice_Array;

public class Problelm1 {
	
	public static void main(String[] arg) {
		int[] arr = {1,2,3,4,5,6,7};
		int max = arr[0]; 
		int secmax=Integer.MIN_VALUE;
		for(int i =1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=secmax;
			}else if(arr[i]>secmax&&arr[i]!=max) {
				secmax=arr[i];
			}
			
		}
		System.out.println(max);	
		System.out.println(secmax);
	}

}
