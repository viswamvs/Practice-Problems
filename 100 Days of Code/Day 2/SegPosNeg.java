/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static void segregatePosNeg(int[] arr)
    {
        int n = arr.length;
        int i = -1, j = n;
        while(true){
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i >= j)return;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
	public static void main (String[] args) {
		int[] a = {-12,11,-13,-5,6,-7,5,-3,-6};
		segregatePosNeg(a);
		for(int x:a)
		    System.out.print(x + " ");
	}
}