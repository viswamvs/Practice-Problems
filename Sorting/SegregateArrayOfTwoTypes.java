import java.util.*;

public class SortArray{
    
    //naive method
    public static void segregateArray(int a[])
    {
        int n = a.length;
        int[] temp = new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(a[i] == 0)
            {
                temp[index] = a[i];
                index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] != 0)
            {
                temp[index] = a[i];
                index++;
            }
        }
        for(int i=0;i<temp.length;i++)
            System.out.print(temp[i] + " ");
    }
    
    //efficient approach
    public static void segregateArray1(int arr[])
    {
        int n = arr.length;
        int low = 0, high = n-1;
        int i=low-1, j=high+1;
        while(true)
        {
            do{i++;}while(arr[i] % 2 == 0);
            do{j--;}while(arr[i] % 2 != 0);
            if(i >= j)return;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    public static void main (String[] args) {
        int a[] = {15,14,13,12};
        segregateArray1(a);
        
        for(int x:a)
            System.out.print(x + " ");
    }
}