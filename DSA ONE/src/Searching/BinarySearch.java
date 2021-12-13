package Searching;

public class BinarySearch{
	
	static int bSearch(int arr[],int low,int high,int x) {
		int n=arr.length;
		if(low>high)return -1;
		int mid = (low+high)/2;
		
		if(arr[mid]==x)return mid;
		else if(arr[mid]>=x)
			return bSearch(arr,low,mid-1,x);
		else
			return bSearch(arr,mid+1,high,x);
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,70};
		int n =arr.length;
		int low =0,high = n-1,x=20;
		System.out.println("The index at which element "+x+" is present : "+bSearch(arr,low,high,x));
	}
}