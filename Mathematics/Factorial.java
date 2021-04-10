package com.company;

public class Factorial {
    public int factorial(int n){
        int fact = 1;
        if (n == 0 || n ==1)
            return fact;
        for (int i=2;i<=n;i++)
            fact = fact*i;
        return fact;
    }

    public int factorialRecursive(int n){
        if(n<=1)
            return 1;
        return n*factorialRecursive(n-1);
    }
}
