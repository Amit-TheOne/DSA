package Array;

// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans=ans+nums[i];
            arr[i]=ans;
        }
        return arr;
    }
}