package mathematics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = 1;
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
