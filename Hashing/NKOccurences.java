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
    
    //more efficient solution
    public static void nk(int arr[], int k)
    {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(arr[i]))
            {
                int count = m.get(arr[i]);
                m.put(arr[i], count + 1);
            }
            else if(m.size() < k-1)
                m.put(arr[i], 1);
            else
            {
                for(Map.Entry e : m.entrySet())
                {
                    Integer c = (Integer) e.getValue();
                    m.put((Integer) e.getKey(), c-1);
                    if((Integer) e.getValue() == 0)
                        m.remove(e.getKey());
                }
            }
        }
        for(Map.Entry x : m.entrySet())
        {
            int count = 0;
            for(int i=0;i<n;i++)
            {
                if((Integer)x.getKey() == arr[i])
                    count++;
            }
            if(count > n/k)
                System.out.print(x.getKey() + " ");
        }
    }
    
	public static void main (String[] args) {
		int[] a = {10,10,20,30,20,10,10};
		nk(a,3);
	}
}