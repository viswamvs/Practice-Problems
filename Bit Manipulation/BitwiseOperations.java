public class Solution{
    
    //set a bit at kth position
    public static int setBit(int n, int k)
    {
        return  ((1 << k) | n);
    }
    
    //unset a bit at kth position
    public static int unsetBit(int n, int k)
    {
        return (~(1 << k) & n);
    }
    
    //toggle a bit at kth position
    public static int toggle(int n, int k)
    {
        return ((1 << k) ^ n);
    }
    public static void main(String[] args){
        System.out.println(toggle(5,2));
    }
}