package recursion;

import java.util.Scanner;

public class MovementInMatrix {
	
	static int count(int n,int m) {
		if(n==1 || m==1) {
			return 1;
		}
		return count(n-1,m)+count(n,m-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("the no. of ways to reach end is "+count(n,m));
	}

}
//in this problem you have been given n*m matrix and you have to move from  start=i(1)j(1)
//to i(n)j(m) given that you can only move right and downwards ....
//you have to return no. of ways you can reach end from start. 