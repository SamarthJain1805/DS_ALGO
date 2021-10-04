package recursion;

import java.util.Scanner;

public class PowerSet {

	static void powerSet(String s,int i,String cur) {
		
		int n =s.length();
		
		if(i == n) {
			System.out.print(cur+" ");
			return;
		}
		
		
	powerSet(s,i+1,cur);
		powerSet(s,i+1,cur+s.charAt(i));
		 

	}
	public static void main(String[] args) {
		String s = "sbc";
		int index = 0;
		String cur = "";
		powerSet(s,index,cur);
	}

}
