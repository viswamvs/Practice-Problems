// Unique Number of Occurrences

// Given an array of integers arr, write a function that returns true 
// if and only if the number of occurrences of each value in the array is unique.

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. 
// No two values have the same number of occurrences.

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:arr)
            h.put(x, h.getOrDefault(x,0) + 1);
        HashSet<Integer> s = new HashSet<>(h.values());
        return (s.size() == h.size());
    }
}