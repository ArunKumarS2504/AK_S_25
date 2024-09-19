package ArunKumar;

public class NewPrime {
	   
	public static void main(String arg[]) {
		 num();
	
		
	}


  
   public static void num() {

	
	   
	   int[] numbers = {13,17,21,31,5,999991,23,25};
	   int n;
	   
	   for(int i=0;i<numbers.length;i++) {
		   n=numbers[i];
		   int rem=0;
		   for(int j=1;j<=n;j++) {
			   if(n%j==0) {
				   rem++;  
			   }
		   }
		   if(rem==2) {
			   System.out.println("prime"+numbers[i]);
		   }
		   else {
			   System.out.println("Not"+numbers[i]);

		   }
	   }
   }
} 