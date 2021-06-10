public class PalindromeCheck{
    
    public static boolean isPal(String str, int start, int end)
    {
        if(end <= start)
            return true;
       	return ((str.charAt(start)==str.charAt(end)) && 
			     isPal(str, start + 1, end - 1));
        
    }
    public static void main(String[] args){
        String s = "mam";
        System.out.println(isPal(s, 0, s.length()-1));
    }
}