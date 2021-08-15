// Counting Bits

// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
// ans[i] is the number of 1's in the binary representation of i.

// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10

class Solution {
    public int countBit(int n)
    {
        int res = 0;
        while(n>0)
        {
            n = n & (n-1);
            res++;
        }
        return res;
    }
    
    public int[] countBits(int n) {
        int result[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int res = countBit(i);
            result[i] = res;
        }
        return result;
    }
}