package bitManipulation;

import java.util.Scanner;

public class NonRepeatingElement {
	
	static int findSingle(int ar[],int ar_size) {
		int res = ar[0];
		for(int i =1;i<ar_size;i++)
			res = res^ar[i];
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		
		for(int i = 0; i<ar.length;i++)
			ar[i] = sc.nextInt();
		
		
		System.out.println("element occuring once is "+findSingle(ar,n)+" ");
	}
		
		
	}

