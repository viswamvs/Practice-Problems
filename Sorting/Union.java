import java.io.*;
import java.util.*;

class GFG {
    
    //naive approach
    public static void union(int[] a, int[] b)
    {
        int m = a.length;
        int n = b.length;
        int[] temp = new int[m+n];
        for(int i=0;i<m;i++)
            temp[i] = a[i];
        for(int i=0;i<n;i++)
            temp[i+m] = b[i];
        Arrays.sort(temp);
        for(int i=0;i<(m+n);i++)
        {
            if(i>0 && temp[i] == temp[i-1]) 
                continue;
            System.out.print(temp[i] + " ");
        }
    }
    
    //efficient approach
    public static void union1(int a[], int b[])
    {
        int m = a.length;
        int n = b.length;
        int i=0,j=0;
        while(i<m && j<n)
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
                System.out.print(a[i] + " ");
                i++;
            }
            else if(a[i] > b[j])
            {
                System.out.print(b[j] + " ");
                j++;
            }
            else
            {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while(i < m)
        {
            if(i>0 && a[i] == a[i-1])
            {
                i++;
                continue;
            }
            System.out.print(a[i] + " ");
            i++;
        }
        while(j < n)
        {
            if(j>0 && b[j] == b[j-1])
            {
                j++;
                continue;
            }
            System.out.print(b[j] + " ");
            j++;
        }
    }
	public static void main (String[] args) {
		int[] a = {3,5,10,10,10,15,15,20};
		int[] b = {5,10,10,15,30};
		union1(a,b);
	}
}