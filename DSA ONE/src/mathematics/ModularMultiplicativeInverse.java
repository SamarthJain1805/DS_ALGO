package mathematics;

import java.util.Scanner;

public class ModularMultiplicativeInverse {
	
	static int modMultiplicativeInverse(int a,int m) {
		for(int i =0;i<m;i++) {
			if((a*i)%m==1)
				return i;
		}
		return -1;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(modMultiplicativeInverse(a, m));
	}

}
