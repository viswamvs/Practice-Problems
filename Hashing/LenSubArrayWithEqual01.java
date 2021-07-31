/*package whatever //do not write package name here */
//length of longest subarray with equal no.of. zeros and ones

import java.io.*;
import java.util.*;

class GFG {
    public static int countZeroOnes(int[] arr)
    {
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            int countZero = 0, countOne = 0;
            for(int j=i;j<n;j++)
            {
                if(arr[j] == 0)
                    countZero++;
                else
                    countOne++;
                if(countOne == countZero)
                    res = Math.max(res, countZero+countOne);
            }
        }
        return res;
    }
    
    //efficient solution
    public static int countZeroOnes1(int[] arr)
    {
        int n = arr.length;
        int pre_sum = 0, res = 0;
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
                arr[i] = -1;
            pre_sum += arr[i];
            if(pre_sum == 0)
                res = i+1;
            if(m.containsKey(pre_sum) == false)
                m.put(pre_sum,i);
            if(m.containsKey(pre_sum))
                res = Math.max(res, i - m.get(pre_sum));
        }
        return res;
    }
    
	public static void main (String[] args) {
		int[] a = {1,0,1,1,1,0,0};
		System.out.println(countZeroOnes1(a));
	}
}