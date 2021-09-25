package mathematics;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
	 if(n==0) return 1;
		 
	return n*factorial(n-1);	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int factorial = 1;
	int n = sc.nextInt();
		
//		for(int i=n;i>=1;i--) {
//			factorial *= i;
		
//		}
          	System.out.println(factorial(n));
	}

}
