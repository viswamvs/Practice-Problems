package com.company;

public class KthSet {

    //using left shift operator
    public void kthbitL(int n, int k){
        if ((n & (1 << (k - 1))) != 0)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
        }

    // using right shift operator
    public void kthbitR(int n, int k) {
        if((n >> (k-1) & 1 ) != 0)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }

    //indexing from 0
    public boolean Kthbit(int n, int k)
    {
        if ((n & (1 << k)) != 0)
            return true;
        else
            return false;
    }
}
