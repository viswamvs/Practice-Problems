/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
   
    static void missingAndRepeating(int[] arr)
    {
        int n = arr.length;
        int repeating = 0, missing = 0;
        int[] visited = new int[n+1];
        Arrays.fill(visited, 0);
        for(int i=0;i<n;i++)
        {
            if(visited[arr[i]] == 1)
                repeating = arr[i];
            visited[arr[i]] = 1;
        }
        for(int i=1;i<visited.length;i++)
        {
            if(visited[i] == 0)
                missing = i;
        }
        System.out.print("Repeating : " + repeating + " " + "Missing : " + missing);
        
    }
   
	public static void main (String[] args) {
	    int[] a = {3,1,3};
		missingAndRepeating(a);
	}
}