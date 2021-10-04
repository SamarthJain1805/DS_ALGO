package recursion;

import java.util.Scanner;

public class SubsetSumProblem {

	static int countSubsets(int arr[],int n,int sum) {
		if(n==0) return(sum==0)?1:0;
		
		return countSubsets(arr,n-1,sum)+countSubsets(arr,n-1,sum-arr[n-1]);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n =sc.nextInt();
		
		System.out.println("enter the elements of the array  :");
	    int arr[] = new int[n];
	    
	    for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	    int sum = 8;
       System.out.println("the no. of subsets having sum "+sum+" is "+countSubsets(arr,n,sum));
		
	}

}
//problem statement : you are given an array of numbers  and a sum,
//you have to return the (count)no. of subsets whose sum corresponds to the given sum;   