package mathematics;

import java.util.Scanner;

public class ModuloArithmetics{
	static long fastPower(long a, long b,int n) {
		long res =1;
		
		while(b>0) {
			if((b&1)!=0) {
				res = (res%n * a%n)%n;
			}
			a = (a%n * a%n)%n;
			b = b>>1;
		}
		System.out.println(res);
		return res;
	}

	static int fastPower(int a,int b) {
		int res =1;
		
		while(b>0) {
			if((b&1) !=0) {
				res *= a;
			}
			a= a*a;
			b = b>>1;
		}
	
		System.out.println(res);
		return res;
			}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		fastPower(a,b,n);
	}

}
