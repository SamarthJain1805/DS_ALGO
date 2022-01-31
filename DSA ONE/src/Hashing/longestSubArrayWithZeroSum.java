package Hashing;
import java.util.*;

public class longestSubArrayWithZeroSum{
	
	public static void main(String []args) {
		int arr[] = {1,0,1,1,1,0,0};
		int n = arr.length;
		
		System.out.println(longSubArrayWithZeroSum(arr, n));
	}
	
	static int longSubArrayWithZeroSum(int arr[],int n) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int sum =0,maxLen=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)arr[i]=-1;
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		
			if(sum==0)maxLen=i+1;
			
			if(hm.containsKey(sum+n)==true) {
				if(maxLen<i-hm.get(sum+n))
					maxLen=i-hm.get(sum+n);
			}else
				hm.put(sum+n, i);
		}
	return maxLen;
		
	}
}