/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    //naive solution
    static boolean areAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        char[] a = s1.toCharArray();
        Arrays.sort(a);
        s1 = new String(a);
        
        char[] b = s2.toCharArray();
        Arrays.sort(b);
        s2 = new String(b);
        
        return (s1.equals(s2));
    }
    
    //efficient solution
    static boolean areAnagrams(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
            if(count[i] != 0)
                return false;
        return true;
    }
    
	public static void main (String[] args) {
	    System.out.println(areAnagrams("listen", "silent"));
	}
}