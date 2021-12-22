package Searching;

class SearchInAnInfiniteSizedArray {                       //Sorted array.

	static int search(int arr[],int x) {
		int i=0;
		while(true) {
			if(arr[i]==x)return i;
			if(arr[i]>x)return -1;
			i++;                                           //naive.
		}
	}
	
	static int search2(int arr[],int x) {
	
		if(arr[0]==x)return 0;
		int i=1;
		while(arr[i]<x) {
			i=i*2;
			if(arr[i]==x)return i;
		}	
			return bSearch(arr,x,i/2+1,i-1);
	}
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
		// TODO Auto-generated method stub

		int arr[]= {1,10,15,20,40,80,90,100};
		int x=25;
		System.out.println(search(arr,x));
		}

}
