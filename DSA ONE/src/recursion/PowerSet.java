package recursion;

import java.util.Scanner;

public class PowerSet {

	static void powerSet(String s,int index,String cur) {
		
		int n =s.length();
		
		if(index == n) {
			return;
		}
		System.out.print(cur+" ");
		 
		for(int  i = index+1; i<n; i++) {
			cur+= s.charAt(i);
			powerSet(s,i,cur);
			
			cur = cur.substring(0, cur.length()-1);
			
		}
	}
	public static void main(String[] args) {
		String s = "sbc";
		int index = -1;
		String cur = "";
		powerSet(s,index,cur);
	}

}
