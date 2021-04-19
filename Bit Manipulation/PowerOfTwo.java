package com.company;

public class PowerOfTwo {

    //naive solution
    public boolean pow(int n)
    {
        if(n == 0)
            return false;
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    //efficient solution
    public boolean powOfTwo(int n)
    {
        if (n == 0)
            return false;
        return ((n & (n-1)) == 0);
    }

    //one line solution
    public boolean powOf2(int n)
    {
        return ((n != 0) && ((n & (n-1)) == 0));
    }
}
