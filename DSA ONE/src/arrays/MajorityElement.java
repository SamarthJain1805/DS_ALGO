package arrays;

import java.util.Scanner;

public class MajorityElement {

	static int majorityElement(int a[],int n) {
		
		int maxCount = 0;
		int index = -1;
		for(int i=0;i<a.length;i++) {
			int count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount = count;
				index = i;
			}	
		}
		if(maxCount> n/2)
			System.out.println(a[index]);
		else
			System.out.println("No majority Element.");
		
		return maxCount;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
			
		}
		majorityElement(a,n);
	}
}
