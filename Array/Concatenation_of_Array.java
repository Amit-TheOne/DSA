package Array;

// https://leetcode.com/problems/concatenation-of-array/
    
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for (int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        
        for (int i=0; i<nums.length; i++){
            ans[i+len]=nums[i];
        }
        return ans;   
        // ans = nums;
            // ans = append(nums[]);
        
    }
}
