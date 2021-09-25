package mathematics;

import java.util.Scanner;

public class AllDivisorsOfANumber {
	
	static void printDivisor(int n) {
		int i;
		for( i=1;i*i<n;i++) {
			if(n%i==0)System.out.println(i);
		}
		for( ;i>=1;i--) {
			if(n%i==0)System.out.println(n/i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the no. : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

		printDivisor(n);
	}

}
