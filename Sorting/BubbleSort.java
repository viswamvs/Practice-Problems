/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    //swap function
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    
    //bubble sort
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
           for(int j=0;j<n-1-i;j++)
           {
               if(arr[j] > arr[j+1])
               {
                  swap(arr[j],arr[j+1]);
               }
           }
        }
    }
    
    //print function
    public static void printArray(int arr[])
    {
         for(int i=0;i<arr.length;++i)
            System.out.print(arr[i] + " ");
    }
	public static void main (String[] args) {
		int[] a = {10,5,8,20,2,18};
		bubbleSort(a);
		printArray(a);
	}
}