package com.company;

public class CountSetBits {

    //naive solution
    public int countSet(int n)
    {
        int res = 0;
        while (n > 0)
        {
            if ((n & 1) == 1)
                res++;
            n = (n >> 1);
        }
        return res;
    }

    //brian kerningam's algorithm
    public int countBits(int n)
    {
        int res = 0;
        while (n > 0)
        {
            n = n & (n-1);
            res++;
        }
        return res;
    }
}
