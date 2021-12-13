package arrays;

public class SumOfElementsInGivenRange {
	
    static int[] preSum(int arr[], int n)
    {
    	
    	int prefix_sum[] = new int[n];

    	prefix_sum[0] = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		prefix_sum[i] = prefix_sum[i - 1] + arr[i];
    	}
    	
    	return prefix_sum;
    }
  
	static int getSum(int prefix_sum[],int l,int r) {
		if(l!=0)
		   return	prefix_sum[r]-=prefix_sum[l-1];
		else
		   return	prefix_sum[r];
	}
	public static void main(String[] args) {
		int arr[] = {2,8,3,9,6,5,4};
		int n =arr.length;
		
		 int prefix_sum[] = preSum(arr, n);

	       System.out.println(getSum(prefix_sum, 1, 3));
	       
	       System.out.println(getSum(prefix_sum, 0, 2));
	       
	}
}
//find sum of elements in range of these two indexes including them also;
//ex: arr[]={2,8,3,9,6,5,4}
//     queries--> getSum(0,2)
//                       l,r  l->left,r->right
//                getSum(1,3)
//			      getSum(2,6)
//O/P:13 20 27