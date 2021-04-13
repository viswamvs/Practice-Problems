package com.company;

public class TrailingZerosInFactorial {

    public int countZeros(int n) {
        int res = 0;
        for(int i=5;i<=n;i=i*5){
            res = res + (n / i);
        }
        return res;
    }

    //inefficient code
    public int count(int n){
        int res = 0;
        long fact = 1;
        if(n <= 1)
            return (int) fact;
        for(int i=2;i<=n;i++){
            fact = fact * i;
        }
        while(fact % 10 == 0){
            res++;
            fact = fact/10;
        }
        return res;
    }
}
