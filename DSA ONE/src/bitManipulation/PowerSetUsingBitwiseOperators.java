package bitManipulation;

import java.util.Scanner;

public class PowerSetUsingBitwiseOperators {
	
	static void printPowerSet(String str) {
		int n =str.length();
		int powSize =(int) Math.pow(2, n);
		
		for(int count =0;count<powSize;count++) {
			for(int j =0;j<count;j++) {
				if((count&(1<<j))!=0) {
					System.out.print(str.charAt(j));
				}
				
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.nextLine();
		printPowerSet(str);

	}

}
