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

    //using arraylist
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        long D = b*b -4*a*c;
        if(D < 0)
        {
            System.out.print("Imaginary");
        }
        else if (D == 0)
        {
            double x = (-b + (float)Math.sqrt(D)) / (2.0*a);
            numbers.add((int) Math.floor(x));
            numbers.add((int) Math.floor(x));
        }
        else
        {
            int x = (int)Math.floor((-b + (float)Math.sqrt(D)) / (2.0*a));
            int y = (int)Math.floor((-b - (float)Math.sqrt(D)) / (2.0*a));
            numbers.add(Math.max(x,y));
            numbers.add(Math.min(x,y));
        }
        return (numbers);
    }
}
