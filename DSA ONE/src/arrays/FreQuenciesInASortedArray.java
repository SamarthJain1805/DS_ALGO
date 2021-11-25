package arrays;

public class FreQuenciesInASortedArray {
	
	static void printFreq(int arr[],int n) {
		int freq =1,i=1;
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			i++;
			freq=1;
		}
		if(n==1 || arr[n-1]!=arr[n-2]) {
		System.out.println(arr[n-1]+" +1");	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,10,10,25,30,30},n=6;
		
		System.out.println("The Given array is :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Frequencies of the no.s are :");
		printFreq(arr,n);
	}

}
