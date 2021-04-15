package com.company;

public class ComputingPower {
    public int powerOfN(int x, int n)
    {
        int res = 1;
        for(int i=0;i<n;i++)
        {
            res = res * x;
        }
        return res;
    }

    //efficient method
    public int power(int x, int n)
    {
        if(n==0)
            return 1;
        int temp = power(x, n/2);
        temp = temp * temp;
        if(n%2 == 0)
            return temp;
        return temp * x;
    }
}
