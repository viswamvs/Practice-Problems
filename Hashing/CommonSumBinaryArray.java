/*package whatever //do not write package name here */
//Longest common span with same sum in binary array

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static int maxLen(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            int sum1 = 0, sum2 = 0;
            for(int j=i;j<n;j++)
            {
                sum1 += arr1[j];
                sum2 += arr2[j];
                if(sum1 == sum2)
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }
    
    //effiient solution
    public static int maxLen1(int[] arr1, int[] arr2)
    {
        int n = arr1.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = arr1[i] - arr2[i];
        int res = 0, pre_sum = 0;
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            pre_sum += arr[i];
            if(pre_sum == 0)
                res = i+1;
            if(m.containsKey(pre_sum) == false)
                m.put(pre_sum, i);
            if(m.containsKey(pre_sum))
                res = Math.max(res, i - m.get(pre_sum));
        }
        return res;
    }
    
	public static void main (String[] args) {
		int[] a = {0,1,0,0,0,0};
		int[] b = {1,0,1,0,0,1};
		System.out.println(maxLen1(a,b));
	}
}