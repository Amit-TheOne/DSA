package Array;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    
    boolean even(int num){
        int numberOfDigit = digits(num);
        return numberOfDigit % 2 == 0;
    }
    
    int digits (int num){
        return (int)(Math.log10(num)) + 1;
    }
    

    //First Approach
    // int digit(int num){
    //    int count = 0;
    //     while (num > 0){
    //         count++;
    //         num/=10;
    //     }
    //     return count;
    // }
    
}