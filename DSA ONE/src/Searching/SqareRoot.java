package Searching;

public class SqareRoot {

	static int SquareRoot(int x) {
		int low =1,ans=-1,high=x;
	
		while(low<=high) {
			int mid=(low+high)/2;
			int msq = mid*mid;
			
			if(msq==x)return mid;
			
			else if(msq>x)
				high =mid-1;
			else {
				low=mid+1;
			    ans = mid;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =16;
		System.out.println("Square root of "+x+" is :"+SquareRoot(x));
	}

}
