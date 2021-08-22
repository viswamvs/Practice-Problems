/* Improved pattern search for distinct characters in pattern */

import java.io.*;

class GFG {
    
    static void patternSearch(String txt, String pat)
    {
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<=n-m;)
        {
            int j;
            for(j=0;j<m;j++)
                if(txt.charAt(i+j) != pat.charAt(j))
                    break;
            if(j == m)
                System.out.print(i + " ");
            if(j == 0)
                i++;
            else
                i = i + j;
        }
    }
    
	public static void main (String[] args) {
		String txt = "ABCABCDABCD";
		String pat = "ABCDF";
		patternSearch(txt,pat);
	}
}