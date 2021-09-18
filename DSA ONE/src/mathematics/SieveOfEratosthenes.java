package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime[] =sieveOfEratosthenes(n);
			for(int i=0;i<=n;i++) {
				System.out.println(i+" "+isPrime[i]);
			}
	}
	
	static boolean[] sieveOfEratosthenes(int n) {
		
		 boolean isPrime[] =new boolean[n+1];
		 Arrays.fill(isPrime, true);
		 
		 isPrime[0]=false;
	     isPrime[1]=false;
	     
	     for(int i=2;i*i<=n;i++) {
	    	 for(int j =2*i;j<=n;j+=i) {
	    		 isPrime[j] =false;
	    	 }
	     }
		return isPrime;
	}
}
