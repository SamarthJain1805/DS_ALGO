package bitManipulation;

import java.util.Scanner;

public class TwoNonRepeatingElement {
	
	static void findTwoNonRep(int ar[], int ar_size) {
		int sum = 0;
		
		int sum1 = 0;
		int sum2=0; 
		
		for(int i =0;i<ar.length;i++) {	
		sum = sum^ar[i];
		}
		
		sum = sum&(-sum);
		
		for(int i=0;i<ar.length;i++) {
		if((ar[i]&sum)>0) {
		   sum1 = sum1^ar[i];
		}else {
			sum2 = sum2^ar[i];
		}	
		}
		System.out.println("the two non repeating numbers are " +sum1+" " + sum2);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ar[] = new int[n];
				
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		findTwoNonRep(ar,n);
	}
}
