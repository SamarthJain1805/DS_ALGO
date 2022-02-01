package Hashing;
import java.util.*;


public class PrintmoreThanNbyKOccurences {

	public static void main(String[] args) {
		 int arr[] = new int[]{10, 10, 20, 30, 20,20,10,10,10,20,20};
	        
	        int n = arr.length;
	        int k=3;
	        printNByK(arr, n, k);
	}
	static void printNByK(int arr[],int n, int k) {
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer>e:m.entrySet()) {
		    if(e.getValue()>n/k) {
			System.out.print(e.getKey()+" ");
		   }
		}
	}
}
//Q.Given n elements in an array and a small value k return the elements which are occuring
//  more than n/k times.