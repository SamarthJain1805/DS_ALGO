package mathematics;

import java.util.Scanner;

public class TrailingZeroesInfactorial {
	
	static int trailingZeroes(int n) {
		int res = 0;
		for(int i =5;i<=n;i*=5) {
			res += n/i;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("no. of trailing zeroes in factorial of "+n+" is "+trailingZeroes(n));
		}
}
 