package com.company;

public class SampleArray {

    // search operation
    int search(int arr[], int n, int x)
    {
        for(int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    //insert operation
    int insert(int arr[], int n, int cap, int pos, int x)
    {
        if (n == cap)
            return n;
        int idx = pos - 1;
        for(int i = n-1;i>=1;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[idx] = x;
        return (n+1);
    }
}
