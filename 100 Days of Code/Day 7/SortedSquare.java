/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void square(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = arr[i] * arr[i];
        
        int low = 0, high = n-1, idx = n-1;
        while(low <= high)
        {
            if(arr[high] > arr[low])
            {
                temp[idx] = arr[high];
                high--;
                idx--;
            }
            else
            {
                temp[idx] = arr[low];
                low++;
                idx--;
            }
        }
        
        for(int i=0;i<temp.length;i++)
            System.out.print(temp[i] + " ");
    }
	public static void main(String[] args) {
        int[] a = {-5,-3,-1,0,4,6};
        square(a);
	}
}
