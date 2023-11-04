package ArunKumar;

import java.util.Scanner;

public class ROOM {

	public static void main(String[] args) {
		
			
				Scanner s = new Scanner(System.in);
				System.out.println(" Enter the Two number :");
				int num1 = s.nextInt();
				int num2 =s.nextInt();
				int result=sum(num1,num2);
				System.out.print("result :"+result);
				s.close();
			}
			static int sum(int a, int b) {
			   int c=a+b;
			   return c;
			   
			}
		
              

	}


