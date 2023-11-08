package ArunKumar;

public class PrimeN {
	
	
	    public static void main(String[] args) {
	        int[] numbers = {13,17,21,31,5,999991,23,25};
	        
	        System.out.print("Prime numbers in the array: ");
	        
	        for (int number : numbers) {
	            if (isPrime(number)) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	    
	    // Function to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}

                      	




