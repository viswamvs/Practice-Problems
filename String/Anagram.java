// Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
// For this challenge, the test is not case-sensitive. 
// For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.


import java.io.*;

class GFG {
    
     static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;
    }

	public static void main (String[] args) {
		System.out.println(isAnagram("viswa", "asiwv"));
	}
}