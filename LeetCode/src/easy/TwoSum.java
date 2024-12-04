package easy;

/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
S
 */

public class TwoSum {
	
	    public int[] twoSum(int[] nums, int target) {

	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){

	                 if(nums[i]+nums[j]==target){
	                      return new int[]{i,j};
	                 }
	            }

	            }
	            return null;
	    }

	    public static void main(String[]args){
	       TwoSum ts=new TwoSum();
	      int[]nums1={2,7,11,15};
	      int target1=9;
	      int[] result1=ts.twoSum(nums1,target1);
	     
	      int[]nums2={3,2,4};
	      int target2=6;
	      int[] result2=ts.twoSum(nums2,target2);
	     
	       int[]nums3={3,3};
	      int target3=6;
	      int[] result3=ts.twoSum(nums3,target3);
	     
	         int[]nums4={2,5,5,11};
	      int target4=10;
	      int[] result4=ts.twoSum(nums4,target4);
	      

	    }
	

}
