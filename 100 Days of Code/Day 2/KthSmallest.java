/*package whatever //do not write package name here */

import java.io.*;

class Solution{
    
    //lomuto partition
    public static int lomuto(int[] a, int l, int r)
    {
        int pivot = a[r];
        int i = l-1;
        for(int j=l;j<=r-1;j++)
        {
            if(a[j] < pivot)
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return (i+1);
    }
    public static int kthSmallest(int[] arr, int k) 
    { 
        //Your code here
        int n = arr.length;
        int l=0, r = n - 1;
        while(l <= r)
        {
            int p = lomuto(arr,l,r);
            if(p == k-1)
                return arr[p];
            else if(p > k-1)
                r = p-1;
            else
                l = p+1;
        }
        return -1;
    } 
    public static void main (String[] args) {
        int[] a = {7, 10, 4, 20, 15};
        System.out.println(kthSmallest(a,4));
    }
}
