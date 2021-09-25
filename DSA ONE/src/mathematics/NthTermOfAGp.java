package mathematics;

import java.util.Scanner;

public class NthTermOfAGp {
	
	static int termOfGp(int A,int B,int N) {
 
		int r = B/A;
		return  (A* (int)(Math.pow(r, N-1)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st term of gp : ");
		int A = sc.nextInt();
		System.out.println("enter the 2nd term of gp : ");
		int B = sc.nextInt();
		System.out.println("enter the nth term of gp : ");
		int N= sc.nextInt();

		System.out.println(termOfGp(A,B,N));
	}

}
