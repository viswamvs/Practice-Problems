/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static int kadane(int[] arr)
    {
        int n = arr.length;
        int res = arr[0], sum = arr[0];
        for(int i=1;i<n;i++)
        {
            sum = Math.max(arr[i], sum+arr[i]);
            res = Math.max(res, sum);
        }
        return res;
    }
	public static void main (String[] args) {
		int[] a = {1,2,3,-2,5};
		System.out.println(kadane(a));
	}
}