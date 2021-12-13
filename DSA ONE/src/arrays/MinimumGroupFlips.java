package arrays;

public class MinimumGroupFlips {
	
	static void printGroups(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0])
					System.out.print("From "+i+" to ");
				else
					System.out.println(i-1);
			}
		}
		if(arr[n-1]!=arr[0])
			System.out.println(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,0,1,1,0,0,1,1,0,1};
		printGroups(arr);
	}

}

//problem : given boolean or binary arrays containing 0 asn 1 ,you have to find minimum no. of groups of either 0s 
//and 1s to be flipped so all elements are same.
