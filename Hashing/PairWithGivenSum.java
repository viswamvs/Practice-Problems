import java.io.*;
import java.util.*;

class GFG {
    
    //naive method
    public static boolean isPair(int[] arr, int sum)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
                if(arr[i]+arr[j] == sum)
                    return true;
        }
        return false;
    }
    
    //two pointer approach
    public static boolean checkPair(int arr[], int sum)
    {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while(left < right)
        {
            if(arr[left]+arr[right] == sum)
                return true;
            else if(arr[left]+arr[right] > sum)
                right--;
            else
                left++;
        }
        return false;
    }
    
    //efficient solution
    public static boolean isPairSum(int[] arr, int sum)
    {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int x : arr)
        {
            if(h.contains(sum-x))
                return true;
            else
                h.add(x);
        }
        return false;
    }
    
	public static void main (String[] args) {
		int[] a = {8,3,9,4};
		System.out.println(isPairSum(a, 1));
	}
}