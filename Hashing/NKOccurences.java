/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    
    //time : O(n^2) space : O(n)
    static void nk(int a[], int k)
    {
        int n = a.length;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[i] == a[j])
                    count++;
                if(count > n/k)
                    h.add(a[j]);
            }
        }
        System.out.println(h);
    }
    
    
    //time : O(nlogn) space : O(1)
    static void nkO(int[] a, int k)
    {
        int n = a.length;
        Arrays.sort(a);
        int i=1, freq = 1;
        while(i<n)
        {
            while(i<n && a[i] == a[i-1])
            {
                freq++;
                i++;
            }
            if(freq > n/k)
                System.out.print(a[i-1]  + " ");
            i++;
            freq = 1;
        }
    }
    
    
    //time : O(n) space : O(n)
    static void countNK(int[] arr, int k)
    {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = arr.length;
        for(int x:arr)
        {
                h.put(x, h.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet())
        {
            if((Integer)e.getValue() > n/k)
                System.out.print((Integer)e.getKey() + " ");
        }
    }
    
    //time : O(nk) space : O(k)
    static void countNKOcc(int[] a, int k)
    {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = a.length;
        for(int x : a)
        {
            if(h.containsKey(x))
                h.put(x, h.get(x) + 1);
            if(h.size() < k-1)
                h.put(x, 1);
            else
            {
                for(Map.Entry<Integer,Integer> e : h.entrySet())
                {
                    if((Integer)e.getValue() == 0)
                        h.remove(x);
                    h.put(e.getKey(), e.getValue() - 1);
                }
            }
        }
        
        for(Map.Entry<Integer,Integer> e : h.entrySet())
        {
            int count = 0;
            for(int i=0;i<a.length;i++)
            {
                if((Integer)e.getKey() == a[i])
                    count++;
            }
            if(count > n/k)
                System.out.print((Integer)e.getKey() + " ");
        }
        
    }
    
	public static void main (String[] args) {
	    int[] a = {30,10,20,20,10,20,30,30};
	    countNKOcc(a,4);
	}
}