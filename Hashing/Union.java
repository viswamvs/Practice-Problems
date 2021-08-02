/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    static int union(int[] a, int[] b)
    {
        int count = 0;
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];
        for(int i=0;i<m;i++)
            c[i] = a[i];
        for(int j=0;j<n;j++)
            c[j+m] = b[j];
        Arrays.sort(c);
        for(int i=0;i<(m+n);i++)
        {
            if(i == 0 || c[i] != c[i-1])
                count++;
        }
        return count;
    }
    
    //using hash set
    static int Union(int[] a, int[] b)
    {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int x : a)
            h.add(x);
        for(int y : b)
            h.add(y);
        int res = h.size();
        return res;
    }
    
	public static void main (String[] args) {
	    int[] a = {10,30,10};
	    int[] b = {40,10};
	    System.out.println(Union(a,b));
	}
}