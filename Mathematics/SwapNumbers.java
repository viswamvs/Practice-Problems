package com.company;

public class SwapNumbers {

    //naive method
    public void swap(int a, int b)
    {
        int t;
        t = a;
        a = b;
        b = t;
        System.out.print(a + " " + b);
    }
}
