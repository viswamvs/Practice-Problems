/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int countAndMerge(int[] arr,int l,int m, int r)
    {
        int n1 = m-l+1;
        int res = 0;
        int n2 = r-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = arr[i+l];
        for(int i=0;i<n2;i++)
            right[i] = arr[m+1+i];
            
        int i=0, j=0, k=l;
        while(i<n1 && j<n2)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k] = right[j];
                j++;
                k++;
                res = res + (n1-i);
            }
        }
        while(i<n1)
            arr[k++] = left[i++];
        while(j<n2)
            arr[k++] = right[j++];
        return res;
    }
    
    static int countInv(int[] arr, int low, int right)
    {
        int res = 0;
        if(right > low)
        {
            int mid = (right+low)/2;
            res += countInv(arr,low,mid);
            res += countInv(arr,mid+1,right);
            res += countAndMerge(arr,low,mid,right);
        }
        return res;
    }
    
	public static void main (String[] args) {
		int[] arr = {8,4,2,1};
		System.out.println(countInv(arr,0,3));
	}
}