package randomPracticeQuestions;

import java.util.Scanner;

public class SumOfGreatestOddEven{
	
	static int greatestOddEven(int ar[],int ar_size) {
		int sum =0, odd = 0, even=0;
		
		for(int i =0;i<ar_size;i++) {
			
			if((ar[i]&1)==0) {
				if(ar[i]>even)even = ar[i];
			}else { 
				if(ar[i] > odd)odd = ar[i];
			}
		}
		
		sum = odd+even;   

		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
			
		}
		System.out.println("sum of greatest odd and even no. is"+greatestOddEven(ar,n));
	}
}