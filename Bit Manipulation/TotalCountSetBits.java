package com.company;

public class TotalCountSetBits {

    //recursive solution
    public int countSet(int n)
    {
        int res = 0;
        if(n == 0)
            return 0;
        int t = n;
        while (t > 0)
        {
            t = t & t-1;
            res++;
        }
        return res + countSet(n-1);
    }

    //iterative solution
    public int countSetBits(int n)
    {
        if (n == 0)
            return 0;
        int count = 0;
        for (int i = 1; i <= n; i++)
        {
            int t = i;
            while (t > 0)
            {
                t = t & t-1;
                count++;
            }
        }
        return count;
    }

    //optimized solution
    public int count(int N)
    {
        int two = 2,ans = 0;
        int n = N;
        while(n != 0)
        {
            ans += (N / two)*(two >> 1);
            if((N&(two - 1)) > (two >> 1) - 1)
                ans += (N&(two - 1)) - (two >> 1) + 1;
            two <<= 1;
            n >>= 1;
        }
        return ans;
    }
}
