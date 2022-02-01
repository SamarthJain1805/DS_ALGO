package Hashing;
import java.util.*;

public class unionOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {10,30,10,40};
		int b[]= {40,5,10,15};
		int m =a.length,n=b.length;
		System.out.println(countUnion(a,b,m,n));
	}
	static int countUnion(int a[],int b[],int m,int n) {
		int res=0;
		Set<Integer> h = new HashSet<Integer>();
		for(int i=0;i<m;i++)
		   h.add(a[i]);
		for(int i=0;i<n;i++)
		   h.add(b[i]);
		
		res=h.size();		
		 
	    return res;
	}
	
}
//Q. given two unsorted arrays return the count of unions of both the arrays.,