/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static void patternSearching(String txt, String pat)
    {
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<=n-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(txt.charAt(i+j) != pat.charAt(j))
                    break;
            }
            if(j == m)
                System.out.print(i + " ");
        }
    }
    
	public static void main (String[] args) {
	    String txt = "ABCABCD";
	    String pat = "ABCD";
		patternSearching(txt, pat);
	}
}