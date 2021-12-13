package arrays;

public class SubarrayEqualsToGivenSum {
	
	static boolean isSubSum(int arr[],int sum) {
		int n =arr.length;
		int curr_sum = arr[0],start=0;
		for(int e=1;e<n;e++) {
			while(curr_sum>sum && start<e-1) {
				curr_sum -= arr[start];
				start++;
			}
			if(curr_sum == sum)
				return true;
			if(e<n)
				curr_sum += arr[e];
		}
		return(curr_sum==sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,20,3,10,5};
		int sum =33;
		
		System.out.println(isSubSum(arr,sum));
	}

}

//problem: given an unsorted array of non-negative integers. Find if there is a subarray with given sum.