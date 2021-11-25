package arrays;

public class maximumSumSubArray {

//	static int maxSum(int arr[]) {
//		int n = arr.length;
//		int res = arr[0];
//		
//		for(int i=0;i<n;i++) {
//			int curr = 0;
//			for(int j=i;j<n;j++) {
//				curr += arr[j];
//				res = Math.max(curr, res);                 //Naive approach
//			}
//		}
//		return res;
//	}
	
	static int maxSum(int arr[]) {
		int n =arr.length;
		int res = arr[0];
		int maxEnding = arr[0];
		
		for(int i=1;i<n;i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(res, maxEnding);
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,-8,7,-1,2,3};
		System.out.println(maxSum(arr));
		
	}

}
