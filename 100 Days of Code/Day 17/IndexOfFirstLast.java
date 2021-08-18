// Find First and Last Position of Element in Sorted Array
// Given an array of integers nums sorted in ascending order, 
// find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

class Solution {
    
    //index of first occurence
    public int firstOccur(int[] arr, int x)
    {
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
                high = mid - 1;
            else if(arr[mid] < x)
                low = mid + 1;
            else
            {
                if(mid == 0 || arr[mid-1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    
    //index of last occurence
    public int lastOccur(int[] arr, int x)
    {
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
                high = mid - 1;
            else if(arr[mid] < x)
                low = mid + 1;
            else
            {
                if(mid == n-1 || arr[mid+1] != arr[mid])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int first = firstOccur(nums, target);
        int last = lastOccur(nums, target);
        result[0] = first;
        result[1] = last;
        return result;
    }
}