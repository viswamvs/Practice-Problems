import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    public static boolean isZeroSum(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum += arr[j];
                if(sum == 0)
                    return true;
            }
        }
        return false;
    }
    
    //efficient solution
    public static boolean checkZero(int arr[])
    {
        int n = arr.length;
        HashSet<Integer> h = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i=0;i<n;i++)
        {
            pre_sum += arr[i];
            if(pre_sum == 0)
                return true;
            if(h.contains(pre_sum))
                return true;
            else
                h.add(pre_sum);
        }
        return false;
    }
    
	public static void main (String[] args) {
		int[] a = {3,4,3,-2,-1};
		System.out.println(checkZero(a));
	}
}