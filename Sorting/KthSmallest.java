import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static int kthSmallest(int a[], int k)
    {
        Arrays.sort(a);
        return a[k-1];
    }
    
    //lomuto partition
    public static int partition(int arr[], int l, int r)
    {
        int i = l-1;
        int pivot = arr[r];
        for(int j=l;j<=r-1;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return (i+1);
    }
    
    //efficient approach
    public static int kthSmallest1(int a[], int k)
    {
        int n = a.length;
        int left = 0, right = n-1;
        while(left <= right)
        {
            int p = partition(a,left,right);
            if(p == k-1)
                return a[p];
            else if(p > k-1)
                right = p-1;
            else
                left = p+1;
        }
        return 0;
    }
	public static void main (String[] args) {
	    int[] a = {10,4,5,8,11,6,26};
		System.out.println(kthSmallest1(a,4));
	}
}