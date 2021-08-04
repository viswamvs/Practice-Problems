/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    static int duplicateNumber(int[] arr)
    {
        int n = arr.length;
        int res = 0;
        Arrays.sort(arr);
        for(int i = 0;i<n-1;i++)
        {
            if(arr[i] == arr[i+1])
                res = arr[i];
        }
        return res;
    }
    
    static int duplicate(int[] arr)
    {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int x : arr)
            h.put(x, h.getOrDefault(x,0) + 1);
        for(Map.Entry<Integer,Integer> e : h.entrySet())
            if(e.getValue() > 1)
                return e.getKey();
        return -1;
    }
    
	public static void main (String[] args) {
		int[] a = {2,5,9,6,9,3,8,9,7,1};
		System.out.println(duplicate(a));
	}
}