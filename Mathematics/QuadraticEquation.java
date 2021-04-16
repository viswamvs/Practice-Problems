package com.company;

public class QuadraticEquation {
    public void quadraticEquation(int a, int b, int c)
    {
        int D = b*b -4*a*c;
        if(D < 0)
        {
            System.out.print("Imaginary");
        }
        if(D >= 0)
        {
            float x = (-b + (float)Math.sqrt(D)) / 2*a;
            float y = (-b - (float)Math.sqrt(D)) / 2*a;
            System.out.print(Math.floor(x) + " " + Math.floor(y));
        }
    }
}
