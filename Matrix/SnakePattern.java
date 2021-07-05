/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static void snake(int arr[][])
    {
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++)
        {
            if(i%2 == 0)
            {
                for(int j=0;j<c;j++)
                    System.out.print(arr[i][j] + " ");
            }
            else
            {
                for(int j=c-1;j>=0;j--)
                    System.out.print(arr[i][j] + " ");
            }
        }
    }
	public static void main (String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		snake(a);
	}
}