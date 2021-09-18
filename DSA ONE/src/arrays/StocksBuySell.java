package arrays;

import java.util.Scanner;

public class StocksBuySell {
	
//	static int maxProfit(int a[],int n) {
//		int profit = 0;
//		int maxProfit = 0;
//		
//		for(int i=0;i<a.length;i++) {
//			for (int j=i+1;j<a.length;j++) {
//				profit = a[j]-a[i];
//				if(profit>maxProfit) {
//					maxProfit = profit;                   approach1 : t.c. O(n^2)
//				}                                          
//			}                                           
//		                                                         	
//		}
//		return maxProfit;
//	}
	
	static int maxProfit2(int a[],int n) {
		int maxProfit = 0;
		int minSofar = 1;
		for(int i =0;i<a.length;i++) {
			if(a[i]<minSofar) {
				minSofar=a[i];
			}
			int profit = a[i]-minSofar;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
				
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n-1;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(maxProfit2(a,n));
	}

}
//Stocks buy sell problem.
//buy at minimum and sell at maximum.
//buy once and sell once. 
//1st buy and then sell.
//find the maximum profit.