package arrays;

public class EquilibriumPoint {
	
//	static boolean isEquiPoint(int arr[]) {
//		int n =arr.length;
//		
//		for(int i=0;i<n;i++) {
//			int l_sum = 0,r_sum=0;
//			for(int j=0;j<i;j++)
//				l_sum+=arr[j];
//			for(int k=i+1;k<n;k++)                            //naive approach.
//				r_sum+=arr[k];
//			
//			if(l_sum==r_sum)return true;
//		}
//		return false;
//	}

	static boolean isEquiPoint(int arr[]) {
		int sum =0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int l_sum=0;
		for(int i=0;i<n;i++) {
			if(l_sum == sum-arr[i])
				return true;
		l_sum+=arr[i];
		sum-=arr[i];
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,4,8,-9,20,6};
		
		System.out.println(isEquiPoint(arr));
		
	}

}
//given a fixed array of integer ,find if it has a Equilibrium point.