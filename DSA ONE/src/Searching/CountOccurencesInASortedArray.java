package Searching;

public class CountOccurencesInASortedArray {

	static int countOccurence(int arr[],int x) {
		int n=arr.length;
		
		int first = firstOcc(arr, x);
		if(first==-1)
			return 0;
		return(lastOccurence(arr,x)-first+1);
		
	}
	static int firstOcc(int arr[],int x) {
	
	int n=arr.length;
	int low =0,high = n-1;
	while(low<=high) {
	
	int mid = (low+high)/2;
	
	if(arr[mid]>x)
		high = mid-1;
	
	else if(arr[mid]<x)
		low=mid+1;                                      //iterative
	
	else {
		if(mid==0 || arr[mid-1]!=arr[mid])
			return mid;
		else
			high = mid-1;
	    }
	}
	return -1;		
}
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
        int arr[]= {10,20,20,20,30,30};
        int n =arr.length;
        System.out.println("The no. of occurences of the given element are : "+countOccurence(arr,20));

	}

}
