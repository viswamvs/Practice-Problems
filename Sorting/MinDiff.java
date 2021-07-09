/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    public static int minDiff(int arr[])
    {
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int min = arr[i];
            for(int j=i+1;j<n;j++)
                res = Math.min(res, Math.abs(min-arr[j]));
        }
        return res;
    }
    
    //efficient solution
    public static int minDifference(int arr[])
    {
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
            res = Math.min(res, Math.abs(arr[i]-arr[i-1]));
        }
        return res;
    }
	public static void main (String[] args) {
		int[] a = {10,3,12,20};
		System.out.println(minDifference(a));
	}
}