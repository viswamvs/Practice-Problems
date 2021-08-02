/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    static int Intersection(int[] a, int[] b)
    {
        int m = a.length;
        int n = b.length;
        int res = 0;
        for(int i=0;i<m;i++)
        {
            boolean flag = false;
            for(int j=0;j<i;j++)
            {
                if(a[i] == a[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == true)
                continue;
            for(int j=0;j<n;j++)
            {
                if(a[i] == b[j])
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
    
    //efficient solution - hash map
    //Time : O(m+n), Space : O(m+n)
    static int intersection(int[] a, int[] b)
    {
        int count = 0;
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int x:a)
        {
            m.put(x, m.getOrDefault(x,0) + 1);
        }
        for(int y:b)
        {
            if(m.containsKey(y) == true)
                m.put(y, m.get(y) + 1);
        }
        for(Map.Entry e : m.entrySet())
        {
            if((Integer) e.getValue() > 1)
                count++;
        }
        return count;
    }
    
    //using hash set
    static int inter(int[] a, int[] b)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        int res = 0;
        for(int x : a)
            s.add(x);
        for(int y : b)
        {
            if(s.contains(y))
            {
                res++;
                s.remove(y);
            }
        }
        return res;
    }
    
	public static void main (String[] args) {
	    int[] a = {10,20,10,30,20};
	    int[] b = {20,10,10,40};
	    System.out.println(Intersection(a,b));
	}
}