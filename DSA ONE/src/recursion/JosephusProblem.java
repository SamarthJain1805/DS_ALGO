package recursion;

import java.util.Scanner;

public class JosephusProblem {

	static int jos(int n,int k) {
		if(n==1) {
			return 0;
		}
		return (jos(n-1,k)+k)%n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
 
		System.out.println("the winner is "+jos(n,k) );
	}

}
//int his problem you have n elements and there is a rule=k;
//the n=0 will be having gun and it eleminates the one at kth position;
//and the gun is transfered to k+1 element;;;the last element left must be the output.