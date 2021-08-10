// Sum of Unique Elements
// You are given an integer array nums. 
// The unique elements of an array are the elements that appear exactly once in the array.

// Return the sum of all the unique elements of nums.

// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int sum = 0;
        for(int x:nums)
            h.put(x, h.getOrDefault(x,0) + 1);
        for(Map.Entry e : h.entrySet())
        {
            if((Integer)e.getValue() == 1)
                sum += (Integer)e.getKey();
        }
        return sum;
    }
}