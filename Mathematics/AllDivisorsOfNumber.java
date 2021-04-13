package com.company;

public class AllDivisorsOfNumber {
    public void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
    public void allDiv(int n){
            for(int i=1;i*i<=n;i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    if (i != n / i)
                        System.out.println(n / i);
                }
            }
    }
    public void allDivisors(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i == 0)
                System.out.println(i);
        }
        for(;i>=1;i--){
            if (n%i==0)
                System.out.println(n/i);
        }
    }
}
