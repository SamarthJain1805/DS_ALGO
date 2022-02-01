package Hashing;
import java.util.*;

public class intersectionOfTwoArrays {
	
	public static void main(String []args) {
		int a[]= {10,20,10,30,20};
		int b[]= {20,10,10,40};
		int n =a.length,m=b.length;
		System.out.println(NumberofElementsInIntersection(a, b, n, m));
	}
	    // Function to return the count of the number of elements in
	    // the intersection of two arrays.
	    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
	        // Your code here
	        Set<Integer> h = new HashSet<Integer>();
	        int res=0;
	        for(int i=0;i<n;i++){
	            h.add(a[i]);
	        }
	        for(int i=0;i<m;i++){
	            if(h.contains(b[i])){
	                res++;
	                h.remove(b[i]);
	            }
	        }
	        return res;
	    }
	}

