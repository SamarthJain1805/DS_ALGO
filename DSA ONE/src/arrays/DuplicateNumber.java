package arrays;

import java.util.Scanner;

public class DuplicateNumber {

	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}while(slow != fast);
		
		fast = nums[0];
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		
		return slow;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(findDuplicate(nums));
	}

}
