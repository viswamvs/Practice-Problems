/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static void search(int arr[][], int x)
    {
        int r = arr.length;
        int c = arr[0].length;
        int i=0, j=c-1;
        while(i<r && j >= 0)
        {
            if(arr[i][j] == x)
            {
                System.out.print("Found at (" + i + "," + j + ")");
                return;
            }
            else if(arr[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.print("Not found");
    }
	public static void main (String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		search(a,5);
	}
}