// Single Number III

// Given an integer array nums, in which exactly two elements appear only once 
// and all the other elements appear exactly twice. 
// Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result  = new int[2];
        int xor = 0, res1=0, res2=0;
        for(int i=0;i<nums.length;i++)
            xor = xor^nums[i];
        int sn = xor & (~(xor-1));
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & sn) != 0)
                res1 = res1 ^ nums[i];
            else
                res2 = res2 ^ nums[i];
        }
        result[0] = res1;
        result[1] = res2;
        return result;
    }
}