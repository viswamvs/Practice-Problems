/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static int maxLen(int[] arr, int sum)
    {
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            int curr_sum = 0;
            for(int j=i;j<n;j++)
            {
                curr_sum += arr[j];
                if(curr_sum == sum)
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }
    
    //efficient solution
    public static int lenSubArray(int[] arr, int sum)
    {
        int n = arr.length;
        int pre_sum = 0;
        int res = 0;
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            pre_sum += arr[i];
            if(pre_sum == sum)
                res = i+1;
            if(m.containsKey(pre_sum) == false)
                m.put(pre_sum, i);
            if(m.containsKey(pre_sum - sum))
                res = Math.max(res, i - m.get(pre_sum-sum));
        }
        return res;
    }
    
	public static void main (String[] args) {
		int[] a = {10,5,2,7,1,9};
		System.out.println(lenSubArray(a,15));
	}
}