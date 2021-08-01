/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    //using hashmap
    static int union(int[] a, int[] b)
    {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i:a)
        {
            m.put(i, m.getOrDefault(i,0) + 1);
        }
        for(int j:b)
        {
            m.put(j, m.getOrDefault(j,0) + 1);
        }
        return m.size();
    }
    
    //using merge process in merge sort
    static int Union(int[] a, int[] b)
    {
        int m = a.length;
        int n = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i=0, j=0;
        while(i < m && j < n)
        {
            if(i>0 && a[i] == a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j] == b[j-1])
            {
                j++;
                continue;
            }
            if(a[i] < b[j])
            {
                al.add(a[i]);
                i++;
            }
            else if(a[i] > b[j])
            {
                al.add(b[j]);
                j++;
            }
            else
            {
                al.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<m)
        {
            if(i>0 && a[i] == a[i-1])
            {
                i++;
                continue;
            }
            al.add(a[i]);
            i++;
        }
        while(j<n)
        {
            if(j>0 && b[j] == b[j-1])
            {
                j++;
                continue;
            }
            al.add(b[j]);
            j++;
        }
        int res = al.size();
        return res;
    }
    
	public static void main (String[] args) {
		int[] a = {85,25,1,32,54,6};
		int[] b = {85,2};
		System.out.println(Union(a,b));
	}
}