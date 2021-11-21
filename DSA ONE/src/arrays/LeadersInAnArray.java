package arrays;

public class LeadersInAnArray {
	
	static void leader(int arr[],int n) {
		int curr_leader = arr[n-1];
		System.out.print(curr_leader+" ");
		
		for(int i=n-2;i>=0;i--) {
			if(curr_leader<arr[i]) {
				curr_leader = arr[i];
			System.out.print(curr_leader+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {7,10,4,10,6,5,2} ,  n=7;
		
	
		leader(arr, n);	
		
	}

}
