package com.company;

public class SumOfNatural {

    public int sum(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum++;
            }
        }
        return sum;
    }

    //efficient solution
    public int sumEff(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}
