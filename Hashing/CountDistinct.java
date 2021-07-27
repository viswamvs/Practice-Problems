import java.util.*;

public class GFG{
    
    //naive solution
    public static int countDistinct(int[] arr)
    {
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for(int j=0;j<i;j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                res++;
        }
        return res;
    }
    
    //efficient solution
    public static int countDistinct1(int[] arr)
    {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
            h.add(arr[i]);
        return h.size();
    }
    
    public static void main (String[] args) {
        int[] arr = {10,20,10,20,30};
        System.out.println(countDistinct1(arr));
    }
}