/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static void transpose(int arr[][])
    {
       int r = arr.length;
       int c = arr[0].length;
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
                System.out.print(arr[j][i] + " ");
       }
    }
	public static void main (String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(a);
	}
}