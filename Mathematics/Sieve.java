package com.company;

import java.util.Arrays;

public class Sieve {
    public boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void sieve(int n)
    {
        for (int i=2;i<=n;i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    //efficient method
    public void sieveAlgo(int n)
    {
        if (n<=1)
            return;
        boolean[] p = new boolean[n+1];
        Arrays.fill(p, true);
        for(int i = 2; i * i <= n; i++)
        {
            if(p[i])
            {
                for(int j= 2*i;j <= n;j= j+i)
                {
                    p[j] = false;
                }
            }
        }

        for (int i = 2;i <= n;i++)
        {
            if(p[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
