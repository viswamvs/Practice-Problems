// Given an array of n integers where each value represents the number of chocolates in a packet. 
// Each packet can have a variable number of chocolates. 
// There are m students, the task is to distribute chocolate packets such that: 

// 1. Each student gets one packet.
// 2. The difference between the number of chocolates in the packet with maximum chocolates,
// and packet with minimum chocolates given to the students is minimum.

import java.util.*;
import java.io.*;

class GFG {
    
    static int chocolateDistribution(int[] arr, int m)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = Integer.MAX_VALUE, res = 0;
        for(int i=0;i<=n-m;i++)
        {
            res = arr[m+i-1] - arr[i];
            ans = Math.min(ans,res);
        }
        return ans;
            
    }
    
	public static void main (String[] args) {
		int[] a = {1,3,4,9,9,7,12,56};
		System.out.println(chocolateDistribution(a,5));
	}
}