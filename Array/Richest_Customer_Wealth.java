package Array;

// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] wealth : accounts){
            int sum = 0;
            for (int money : wealth){
                //sum += accounts [wealth][money];
                sum += money;
            }
            
            if (sum> ans){
                ans= sum;
            }
            
        }
        return ans;
    }
}
