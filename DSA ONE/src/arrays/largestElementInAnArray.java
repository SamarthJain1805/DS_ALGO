package arrays;

import java.util.Scanner;

public class largestElementInAnArray {

	static int largestElement(int a[]) {
		int res = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[res])res =i;
		}
		System.out.println("Largest element in the array is"+ a[res]);
		System.out.print("index of the largest element : ");
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter the elements of the array :");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(largestElement(a));
	}

}
