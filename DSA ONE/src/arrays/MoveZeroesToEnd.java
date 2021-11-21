package arrays;

import java.util.Scanner;

public class MoveZeroesToEnd {
	
	static void swap(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		
	}
	
	static void moveToEnd(int a[]) {
		int n = a.length;
		int count =0;
		for(int i=0;i<n;i++) {
	        if(a[i]!=0) { 
	        	swap(a[i],a[count]);
	        	count++;
	           } 
	      } 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
        moveToEnd(a);
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
	}

}
