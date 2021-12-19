package Searching;

public class IndexOfFirstOccurence {
	
//	static int firstOcc(int arr[],int x) {
//		
//		int n=arr.length;
//		int low =0,high = n-1;
//		while(low<=high) {
//		
//		int mid = (low+high)/2;
//		
//		if(arr[mid]>x)
//			high = mid-1;
//		
//		else if(arr[mid]<x)
//			low=mid+1;                                      //iterative
//		
//		else {
//			if(mid==0 || arr[mid-1]!=arr[mid])
//				return mid;
//			else
//				high = mid-1;
//		    }
//		}
//		return -1;		
//	}
	
	 static int firstOcc(int arr[],int low,int high,int x) {
		if(low>high)return -1;
		
		int mid = (low+high)/2;
		if(x>arr[mid])
		    return	firstOcc(arr,mid+1,high,x);
		else if(x<arr[mid])
			return firstOcc(arr,low,mid-1,x);                      //recursive.
		else {
			if(mid==0 || arr[mid-1]!=arr[mid])
				return mid;
			else
				return firstOcc(arr,low,mid-1,x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[] = {5,10,10,20,20};
		int n =arr.length;
		System.out.println(firstOcc(arr,0,n-1,10));
	}

}

