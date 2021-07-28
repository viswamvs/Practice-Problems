/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static boolean checkSum(int[] arr, int givenSum)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum += arr[j];
                if(sum == givenSum)
                    return true;
            }
        }
        return false;
    }
    
    //efficient solution
    public static boolean checkSum1(int[] arr, int sum)
    {
        int n = arr.length;
        int pre_sum = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            pre_sum += arr[i];
            if(pre_sum == sum)
                return true;
            if(h.contains((pre_sum-sum)))
                return true;
            h.add(pre_sum);
        }
        return false;
    }
    
	public static void main (String[] args) {
		int[] a = {5,8,6,13,3,-1};
		System.out.println(checkSum1(a, 22));
	}
}