package com.company;

public class ExactlyThreeDivisors {
    boolean isPrime(int n)
    {
        if(n == 0 || n == 1 )
            return false;
        if( n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i = 5; i * i <= n; i=i+6)
        {
            if(n % i ==0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }
    public int exactly3Divisors(int N)
    {
        int count = 1;
        if (N <= 3)
            return 0;
        for(int i = 3; i <= Math.sqrt(N); i++ )
        {
            if(isPrime(i) && (i * i) <= N)
            {
                count++;
            }
        }
        return count;
    }
}