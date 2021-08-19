/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    static int nonrepeat(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            boolean flag = false;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i) == s.charAt(j))
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                return i;
        }
        return -1;
    }
    
    static int nonRepeat(String s)
    {
        int[] count = new int[256];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        for(int i=0;i<s.length();i++)
            if(count[s.charAt(i)] == 1)
                return i;
        return -1;
    }
    
    static int leftmostNonRepeat(String s)
    {
       LinkedHashMap<Character,Integer> h = new LinkedHashMap<>();
       char[] arr = s.toCharArray();
       for(char x:arr)
       {
           h.put(x, h.getOrDefault(x,0) + 1);
       }
       for(int i=0;i<s.length();i++)
       {
           char ch = s.charAt(i);
           if(h.get(ch) == 1)
            return i;
       }
       return -1;
    }
    
	public static void main (String[] args) {
		System.out.println(nonRepeat("geeksforgeeks"));
		//leftmostNonRepeat("geeksforgeeks");
	}
}