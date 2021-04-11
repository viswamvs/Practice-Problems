package com.company;

public class LCM {
    public int lcm(int a, int b){
        int res = Math.max(a,b);
        while(res>0){
            if(res%a == 0 && res%b == 0)
                return res;
            res++;
        }
        return res;
    }
        int gcd(int a, int b){
            if (b==0)
                return a;
            return gcd(b, a%b);
        }
        int lcmRecursive(int a, int b){
        return a*b / gcd(a,b);
        }
}
