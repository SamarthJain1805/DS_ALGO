package arrays;

import java.util.Scanner;

public class StocksBuySell2 {
	
	static int maxProfit2(int a[],int n) {
		int profit =0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
			profit += (a[i]-a[i-1]);
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(maxProfit2(a,n));
	}

}

//Problem:stocks buy sell2
//you can do multiple buy sell transactions 
//1st buy and then sell in pair(ex. buy1,sell1,buy2,sell2,buy3,sell3)
//you cant buy if you bought just before.