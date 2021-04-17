package com.company;

public class NumberOfDigits {

    public int countDigit(int n){
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    //recursion method
    public int countDigitRecursive(int n){
        if(n==0)
            return 0;
        return 1 + countDigitRecursive(n/10);
    }

    //efficient method
    public int countDigitLog(int n){
        return (int) Math.floor(Math.log10(n) + 1);
    }
}
