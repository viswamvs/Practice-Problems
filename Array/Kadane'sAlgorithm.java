public class KadaneAlgo{
    
    //naive approach
    public static int maxSum(int arr[])
    {
        int n=arr.length;
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
            int cur=0;
            for(int j=i;j<n;j++)
            {
                cur = cur + arr[j];
                res=Math.max(res,cur);
            }
        }
        return res;
    }
    
    //efficient approach
    public static int maxSum1(int arr[])
    {
        int n=arr.length;
        int res=arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<n;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,-2,5};
        System.out.print(maxSum1(arr));
    }
}