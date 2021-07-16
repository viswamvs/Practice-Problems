/*package whatever //do not write package name here */
//Find pair in unsorted array which gives sum X

import java.io.*;

class GFG {
    
    public static boolean isPair(int[] arr, int x)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == x)
                    return true;
            }
        }
        return false;
    }
	public static void main (String[] args) {
		int[] a = {3,5,9,2,8,10,11};
		System.out.println(isPair(a,17));
	}
}