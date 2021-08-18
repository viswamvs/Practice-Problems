/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    //naive method
    static int firstRepeat(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    
    //better approach    
    static int leftmostRepeat(String str)
    {
        int[] count = new int[256];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)] > 1)
                return i;
        }
        return -1;
    }
    
    //efficient method
    static int repeatingCharacter(String s)
    {
        boolean[] count = new boolean[256];
        int res = -1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(count[s.charAt(i)])
                res = i;
            else
                count[s.charAt(i)] = true;
        }
        return res;
    }
    
    
	public static void main (String[] args) {
		System.out.println(repeatingCharacter("abcd"));
	}
}