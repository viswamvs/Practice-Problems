package com.company;

public class LargestElement {

    //naive approach
    public int getLarge(int arr[])
    {
        int n = arr.length;
        for (int i=0;i<n;i++)
        {
            boolean flag = true;
            for(int j=0;j<n;j++)
            {
                if(arr[j] > arr[i])
                {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                return i;
        }
        return -1;
    }

    //efficient approach
    public int getLargest(int arr[])
    {
        int res = 0;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i] > arr[res])
                res = i;
        }
        return res;
    }
}
