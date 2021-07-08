/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    //insertion sort
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    //print array
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
	public static void main (String[] args) {
		int[] a = {20,5,40,60,10,30};
		insertionSort(a);
		printArray(a);
	}
}