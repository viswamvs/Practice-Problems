/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
	public static void main (String[] args) {
		int[] a = {10,5,8,20,2,18};
		selectionSort(a);
	}
}