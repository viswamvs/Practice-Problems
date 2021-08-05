/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    //naive method
    static int missing(int[] arr)
    {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += arr[i];
        int N = n+1;
        int total = (N*(N+1)) / 2;
        return (total - sum);
    }
    
    //using bitwise xor operator
    static int missingNumber(int[] arr)
    {
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++)
            res ^= arr[i];
        int nxor = 0;
        for(int i=1;i<=n+1;i++)
            nxor ^= i;
        return (res ^ nxor);
    }
    
	public static void main (String[] args) {
		int[] a = {1,2,4,5,3,6,8,9};
		System.out.println(missingNumber(a));
	}
}