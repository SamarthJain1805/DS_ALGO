package arrays;

public class MaximumConsecutiveOnes {

//	static int maxConsecutiveOnes(int arr[]) {
//		
//		int res = 0;
//		int n =arr.length;
//		for(int i=0;i<n;i++) {
//			int curr =0;
//			for(int j=1;j<n;j++) {
//				if(arr[j] == 1)
//					curr++;
//				else break;                                    //Naive Approach
//			}
//			res = Math.max(curr, res);
//		}
//		return res;
//		
//	}
	
	static int maximumConsecutiveOnes(int arr[]) {
		int res=0;int curr=0,n =arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				curr =0;                                       //Efficient Approach
			else {
				curr++;
				res=Math.max(res, curr);
			}
		}
		return res;
	}
	public static void main(String []args) {
		int arr[] = {0, 1, 1, 1, 0, 1, 1}, n = 7;

	       System.out.println(maximumConsecutiveOnes(arr));
	}
}
