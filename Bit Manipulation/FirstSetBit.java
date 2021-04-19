package com.company;

public class FirstSetBit {

    public int firstSetBit(int n)
    {
        int res = 1;
        while(n > 0)
        {
            if ((n & 1) == 1)
                break;
            n = n >> 1;
            res++;
        }
        return res;
    }
}
