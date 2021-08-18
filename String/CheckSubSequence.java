/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    //iterative solution
    static boolean isSUb(String s1, String s2)
    {
        int m = s1.length();
        int n=s2.length();
        int  j=0;
        for(int i=0;i<m && j<n;i++)
        {
            if(s1.charAt(i) == s2.charAt(j))
                j++;
        }
        return (j==n);
    }
    
    //recursive solution
    static boolean isSubSeq(String s1, String s2, int m, int n)
    {
        
        if(n == 0)
            return true;
        if(m == 0)
            return false;
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return isSubSeq(s1, s2, m-1, n-1);
        else
            return isSubSeq(s1,s2,m-1,n);
    }
    
	public static void main (String[] args) {
		System.out.println(isSubSeq("", "ACE", 0, 3));
		//System.out.println("geeksforgeeks".length());
	}
}