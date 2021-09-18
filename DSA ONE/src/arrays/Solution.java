package arrays;

import java.util.Scanner;

 public class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	
    	int a=0,b=0	;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) { 
    			if((nums[i]+nums[j])==target){
    				return new int[] {i,j};
    				 
    			}
    
    	     }
    	}
		return new int[] {};
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int target = sc.nextInt();
    	
    	int nums[] = new int[n];
    	for(int i=0;i<nums.length;i++) {
    		nums[i] = sc.nextInt();
    	}
    	
		int[] indices = twoSum(nums,target);
		if(indices.length ==2) {
			System.out.println(indices[0]+" "+indices[1]);
		}else {
			System.out.println("No Solution found!");
		}
    }
}