package arrays;

import java.util.Scanner;

public class SecondLargestElement {
	
	static int secondLargestElement(int a[]) {
		int n = a.length;
		
		int res = -1,largest =0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[largest]) {
				res = largest;
				largest = i;
			}else if(a[i]!=a[largest]) {
				if(res==-1 || a[i]>a[res])
					res =i;
			}
		}
		System.out.println("the second largest element is : "+a[res]);
		System.out.print("index is : ");
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
		System.out.println(secondLargestElement(a));
	}

}
