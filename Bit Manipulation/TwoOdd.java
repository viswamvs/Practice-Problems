package com.company;

public class TwoOdd {

    //naive solution
    public void twoOdd(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 0;

            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count % 2 != 0)
                System.out.print(arr[i]+" ");

        }
    }

    //efficient solution
    public void oddTwo(int arr[], int n)
    {
        int xor = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++)
        {
            xor = xor ^ arr[i];
        }
        int sn = xor & (~(xor-1));
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.print(res1 + " " + res2);
    }
}
