package bitManipulation;

import java.util.Scanner;

public class CountAllSetBits1toN {
	
	    
	    public static int largestPowOf2inRange(int n){
	        int x = 0;
	        while((1<<x)<=n){
	            x++;
	        }
	        return x-1;
	    }
	    
	    //Function to return sum of count of set bits in the integers from 1 to n.
	    public static int countSetBits(int n){
	    
	    if(n==0)return 0;
	    int x = largestPowOf2inRange(n);
	    int btill2x = x*(1<<(x-1));
	    int msb2xton = (n-(1<<x))+1;
	    int rest = countSetBits(n-(1<<x));
	    
	    int ans = btill2x+msb2xton+rest;
	    return ans;
	        
	    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		System.out.println(countSetBits(n));

	}

}
