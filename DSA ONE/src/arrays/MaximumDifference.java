package arrays;

public class MaximumDifference {

	static int minDiff(int arr[],int n) {
		int res = arr[1]-arr[0],minVal = arr[0];
		
		for(int i=1;i<n;i++) {
			res = Math.max(res, arr[i]-minVal);
			minVal = Math.min(minVal, arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,10,6,4,8,1},  n =7;
		
		System.out.println("The Given array is: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("maximum difference is :");
		System.out.println(minDiff(arr, n));
	}

}
