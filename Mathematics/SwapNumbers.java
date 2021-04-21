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

    //efficient solution
    public void swapNum(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(a + " " + b);
    }
}
