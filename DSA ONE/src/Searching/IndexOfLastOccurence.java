package Searching;

public class IndexOfLastOccurence {

//	static int lastOccurence(int arr[],int low,int high,int x) {
//		int n =arr.length;
//		if(low>high)return -1;
//		
//		int mid=(low+high)/2;
//		if(x>arr[mid])
//			return lastOccurence(arr,mid+1,high,x);
//		else if(x<arr[mid])
//			return lastOccurence(arr,low,mid-1,x);                 //recursive
//		
//		else {
//			if(mid==n-1 || arr[mid]!=arr[mid+1])
//		    	return mid;
//		    else
//				return lastOccurence(arr,mid-1,high,x);
//		}
//	}
	
	static int lastOccurence(int arr[],int x) {
	
	int n=arr.length;
	int low =0,high = n-1;
	while(low<=high) {
	
	int mid = (low+high)/2;
	
	if(arr[mid]>x)
		high = mid-1;
	
	else if(arr[mid]<x)
		low=mid+1;                                      //iterative
	
	else {
		if(mid==n-1 || arr[mid]!=arr[mid+1])
			return mid;
		else
			low = mid+1;
	    }
	}
	return -1;		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,10,10,20,20};
		int n =arr.length;
		System.out.println("Last Occurence of the given element is: "+lastOccurence(arr,10));
	}

}
