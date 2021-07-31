/*package whatever //do not write package name here */
//More than n/k Occurences

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static void nkOccurences(int[] arr, int k)
    {
        int n = arr.length;
        Arrays.sort(arr);
        int i=1, count=1;
        while(i<n)
        {
            while(i<n && arr[i] == arr[i-1])
            {
                count++;
                i++;
            }
            if(count > n/k)
                System.out.print(arr[i-1] + " ");
            count = 1;
            i++;
        }
    }
    
    //efficient solution
    public static void nOccurences(int[] arr, int k)
    {
        int n = arr.length;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        
        for(int x:arr)
            m.put(x,m.getOrDefault(x,0)+1);
        for(Map.Entry <Integer,Integer> e:m.entrySet())
            if(e.getValue()>n/k)
                System.out.print(e.getKey()+" ");
    }
    
	public static void main (String[] args) {
		int[] a = {10,10,20,30,20,10,10};
		nOccurences(a,3);
	}
}