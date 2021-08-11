// Two Sum II - Input array is sorted
// Given an array of integers numbers that is already sorted in non-decreasing order, 
// find two numbers such that they add up to a specific target number.

// Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, 
// where 1 <= answer[0] < answer[1] <= numbers.length.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) r--;
            else l++;
        }
        return new int[]{l + 1, r + 1};
    }
}