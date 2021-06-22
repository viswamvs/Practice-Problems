public class PowerOfTwo{
    //naive approach
    public static boolean powOf2(int n)
    {
        while(n != 1)
        {
            if((n & 1) == 1)
                return false;
            n = n >> 1;
        }
        return true;
    }
    
    //efficient approach
    public static boolean isPow(int n)
    {
        return ((n != 0) && ((n & (n-1)) == 0));
    }
    public static void main(String[] args){
        System.out.println(isPow(16));
    }
}