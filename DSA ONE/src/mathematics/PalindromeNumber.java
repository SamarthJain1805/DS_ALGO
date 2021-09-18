package mathematics;

import java.util.Scanner;

public class PalindromeNumber {
	
	static int isPalindrome(int n) {
		
		int temp = n;
		int reversedNumber = 0;
		while(temp>0) {                                                                         
			int lastDigit = temp%10;                                                   //ld = temp(i.e n)%10 = ex. 4554%10=4
			reversedNumber = reversedNumber*10+lastDigit;								//rn = rn*10+ld = 0*10+4 = 4
			temp /= 10;                                                                 //temp /= 10==4554/10=455
		}
			if(reversedNumber == n) {
				System.out.println("the number is palindrome.");
			}else {
				System.out.println("the number is not palindrome.");
			}
			
			
		return reversedNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		isPalindrome(n);
	}

}
