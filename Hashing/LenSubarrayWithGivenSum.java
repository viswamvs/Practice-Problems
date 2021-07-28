import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static int maxLen(int[] arr, int sum)
    {
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            int curr_sum = 0;
            for(int j=i;j<n;j++)
            {
                curr_sum += arr[j];
                if(curr_sum == sum)
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }
    
	public static void main (String[] args) {
		int[] a = {5,2,3,4};
		System.out.println(maxLen(a,5));
	}
}