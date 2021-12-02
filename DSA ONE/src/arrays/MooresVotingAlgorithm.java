package arrays;

public class MooresVotingAlgorithm {
	
	static int majorityElement(int nums[]) {
		int n = nums.length;
		int res = 0;int count =1;
		for(int i=0;i<n;i++) {
			if(nums[res]==nums[i])count++;
			else
				count--;
			if(count ==0) {
				res=i;
				count =1;
			}
		}
			count =0;
			
			for(int i=0;i<n;i++) 
				if(nums[res]==nums[i])
					count++;
				if(count<=n/2)res=-1;
				
			return res;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {6,8,4,8,8};
		System.out.println(majorityElement(nums));
	}

}
