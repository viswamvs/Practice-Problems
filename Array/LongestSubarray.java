public class LongestSubarray{
    
    //naive approach
    public static int fun1(int arr[])
    {
        int n=arr.length;
        int res=1;
        for(int i=0;i<n;i++)
        {
            int cur=1;
            for(int j=i+1;j<n;j++)
            {
                if((arr[j] % 2 == 0 && arr[j-1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j-1] % 2 == 0))
                    cur++;
                else
                    break;
            }
            res = Math.max(res,cur);
        }
        return res;
    }
    
    //efficient approach
    public static int fun2(int arr[])
    {
        int n=arr.length;
        int res=1,cur=1;
        for(int i=1;i<n;i++)
        {
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0))
            {
                cur++;
                res = Math.max(res,cur);
            }
            else
                cur=1;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a[] = {10,20,3,2,10};
        System.out.print(fun2(a));
    }
}