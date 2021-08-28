import java.io.*;

class GFG {
    
    static void reverse(char[] str, int s, int e)
    {
        int low = s;
        int high = e;
        while(low<=high)
        {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    
    static void reverseWords(char str[], int n)
    {
        int start = 0;
        for(int end = 0; end < n;end++)
        {
            if(str[end] == ' ')
            {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n-1);
        reverse(str, 0, n-1);
        
       
    }
    
	public static void main (String[] args) {
	    String s = "welcome to Gfg";
	    char[] str = s.toCharArray();
	    reverseWords(str, s.length());
		System.out.println(str);
	}
}
