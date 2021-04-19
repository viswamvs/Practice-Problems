package com.company;

public class OneOdd {

    //naive solution
    public int oneOdd(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[j] == arr[i])
                    count++;
            if (count % 2 != 0)
                return arr[i];
        }
        return 0;
    }

    //efficient solution
    public int oddOne(int arr[], int n)
    {
        int res = 0;
        for(int i = 0; i < n; i++)
            res = res ^ arr[i];
        return res;
    }
}
