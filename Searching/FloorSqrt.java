/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    //naive solution
    public static int sqrt(int x)
    {
        int i=1;
        while(i*i <= x)
            i++;
        return (i-1);
    }
    
    //efficient solution
    public static int fSqrt(int x)
    {
        int low=1, high=x, ans=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int ms = mid * mid;
            if(ms == x)
                return mid;
            else if(ms>x)
                high = mid-1;
            else
            {
                low=mid+1;
                ans = mid;
            }
        }
        return ans;
    }
	public static void main (String[] args) {
		System.out.println(fSqrt(6));
	}
}