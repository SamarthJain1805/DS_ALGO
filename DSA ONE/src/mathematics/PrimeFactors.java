package mathematics;

import java.util.Scanner;

public class PrimeFactors {

	static void primeFactors(int n) {
		if(n<=1)return;
		
		while(n%2==0) {
			System.out.print(2+" ");
			n=n/2;
		}
		while(n%3==0) {
			System.out.print(3+" ");
			n=n/3;
		}
		for(int i =5;i*i<=n;i+=6) {
			while(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the no. : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

	    primeFactors(n);
	}

}
