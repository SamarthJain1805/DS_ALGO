package arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

	static int remDups(int a[]) {
		int n =a.length;
		int res =1;
		for(int i=1;i<n;i++) {
			if(a[i]!= a[res-1]) {
				a[res] = a[i];
				res++;
			}
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.print("remaining indexes of array :");
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter the elements of the array :");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(remDups(a));

	}

}
