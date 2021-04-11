package com.company;

public class GCD {
    public int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) break;
            res--;
        }
        return res;
    }

    public int GCD(int a, int b){
        while(a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }
    public int GCDRecursive(int a, int b){
        if(b==0)
            return a;
        return GCDRecursive(b, a%b);
    }
}
