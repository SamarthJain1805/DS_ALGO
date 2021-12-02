package arrays;

public class MaxCircularSubarraySum {

//	static int maxCircularSum(int arr[]) {
//		int n = arr.length;
//		int res = arr[0];
//	
//		for(int i=0;i<n;i++) {
//			int curr_sum = arr[i];
//			int curr_max = arr[i];
//			
//			for(int j =1;j<n;j++) {                              //Naive Approach.
//				int index = (i+j)%n;
//				
//				curr_sum = curr_sum+arr[index];
//				curr_max = Math.max(curr_max,curr_sum); 
//			}
//		    res = Math.max(res, curr_max);
//		}
//		return res;
//	}
	
	static int normalMaxSum(int arr[]) {
		int n=arr.length;
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<n;i++) {
			maxEnding = Math.max(maxEnding+arr[i],arr[i]);
			res = Math.max(res, maxEnding);
		}
		return res;
	}
	
	static int overallSum(int arr[]) {
		int n=arr.length;
		int maxNormal = normalMaxSum(arr);
		if(maxNormal<0)return maxNormal;
		
		int arr_sum = 0;
		for(int i=0;i<n;i++) {
			arr_sum += arr[i];
			arr[i] = -arr[i];
		}
		int maxCircular = arr_sum+normalMaxSum(arr);
		return Math.max(maxNormal, maxCircular);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,-2,3,4};
		System.out.println(overallSum(arr));
	//	System.out.println(maxCircularSum(arr));
	}

}
