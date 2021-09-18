package arrays;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int a[]= new int[n];
		for(int i =0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}	
		System.out.println("the maximum contiguous sum is "+maxSubArraySum(a,n));
			
	}
	static int maxSubArraySum(int a[],int n) {
			int max_sum = 0;
			int cur_sum= 0;
			for(int i =0;i<a.length;i++) {
				cur_sum = cur_sum+a[i];
				
				if(cur_sum>max_sum) {
					max_sum = cur_sum;
				}
				if(cur_sum<0) {
					cur_sum=0;
				}
			}
			return max_sum;
		
	}
}
