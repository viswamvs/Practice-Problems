/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static void rotate(int[] arr)
    {
        int n = arr.length;
        int x = arr[n-1];
        for(int i=n-1;i>0;i--)
            arr[i] = arr[i-1];
        arr[0] = x;
         
    }
	public static void main (String[] args) {
		int[] a = {1,2,3,4,5};
		rotate(a);
		
		for(int x : a)
		    System.out.print(x + " ");
	}
}