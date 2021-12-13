package arrays;

public class UnsortedArraySubSumEqualsGivenSum {

	static boolean isSubSum(int arr[],int sum) {
		int n =arr.length;
		int curr_sum = arr[0],start=0;
		
		for(int e=1;e<n;e++) {
			while(curr_sum>sum && start<e-1) {
				curr_sum-=arr[start];
				start++;
			}
			if(curr_sum==sum)return true;
			if(e<n)
				curr_sum+=arr[e];
		}
		return(curr_sum==sum);
	}
	public static void main(String[] args) {
		
		int arr[]= {1,4,20,3,10,5};
		int sum = 33;
		
		System.out.println(isSubSum(arr,sum));

	}

}
//given an unsorted array of non negative integers, find if there is a subarray present with given sum.
//ex arr[]={1,4,20,3,10,5} given sum= 33; o/p: yes subarray{20,3,10}consists of given sum.