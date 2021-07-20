import java.util.*;

public class SegregateArray{
    
    //naive approach
    public static void segregateArray(int arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    
    //swap function
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    
    //efficient approach
    public static void segregateArray1(int arr[])
    {
        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr[low], arr[mid]);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
                mid++;
            else if(arr[mid] == 2)
            {
                swap(arr[mid], arr[high]);
                high--;
            }
        }
    }
    
    //print the array elements
    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    
    public static void main (String[] args) {
        int[] a = {0,1,2,0,1,2};
        segregateArray1(a);
        printArray(a);
        
    }
}