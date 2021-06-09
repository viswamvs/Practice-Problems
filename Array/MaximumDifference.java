public class MaxDiff{
    
    //naive approach
    public static int maxDiff(int arr[])
    {
        int n=arr.length;
        int res=arr[1] - arr[0];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }
    
    //efficient approach
    public static int maxDiff1(int arr[])
    {
        int n=arr.length;
        int res=arr[1]-arr[0];
        int minValue = arr[0];
        for(int i=1;i<n;i++)
        {
            res = Math.max(res, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,3,10,6,4,8,1};
        System.out.print(maxDiff1(arr));
    }
}