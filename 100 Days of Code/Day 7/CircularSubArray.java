//Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
// Input: nums = [1,-2,3,-2]
// Output: 3
// Explanation: Subarray [3] has maximum sum 3

public class Main
{
    
    static int kadane(int[] arr)
    {
        int n = arr.length;
        int res = arr[0], ans=arr[0];
        for(int i=1;i<n;i++)
        {
            res = Math.max(arr[i], res+arr[i]);
            ans = Math.max(ans, res);
        }
        return ans;
    }
    static int minKadane(int[] arr)
    {
        int n = arr.length;
        int res = arr[0], ans=arr[0];
        for(int i=1;i<n;i++)
        {
            res = Math.min(arr[i], res+arr[i]);
            ans = Math.min(ans, res);
        }
        return ans;
    }
    
    static int circularSubarray(int[] arr)
    {
        int n = arr.length;
        int minK = minKadane(arr);
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += arr[i];
        int circularSubarray = sum - minK;
        int kad = kadane(arr);
        return Math.max(kad, circularSubarray);
    }
    
	public static void main(String[] args) {
		int[] a = {3,-4,5,6,-8,7};
		System.out.println(circularSubarray(a));
	}
}
