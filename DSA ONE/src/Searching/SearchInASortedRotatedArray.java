package Searching;

public class SearchInASortedRotatedArray {
	
	static int search(int arr[],int x) {
		int n=arr.length;
		int low =0, high =n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==x)return mid;
			
			if(arr[mid]>arr[low]) {
				if(x>arr[low] && arr[mid]>x)
					high = mid-1;
				else
					low=mid+1;
			}
			else {
				if(x>arr[mid] && x<=arr[high]) 
					low = mid+1;
				else
					high = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,8,9};
		int x=30;
		System.out.println("The index at which the given element "+ x +" is : "+search(arr,x));
	}

}
