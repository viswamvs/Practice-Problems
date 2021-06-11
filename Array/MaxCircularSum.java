public class MaxCircularSum{
    
    //normal maximum sub array sum (kadane's algorithm)
    public static int normalMaxSum(int arr[])
    {
        int n = arr.length;
        int res = arr[0], maxEnding = arr[0];
        for(int i=1;i<n;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    
    //maximum circular subarray sum
    public static int circularMaxSum(int arr[])
    {
        int n = arr.length;
        int max_normal = normalMaxSum(arr);
        if(max_normal < 0)
            return max_normal;
        int arr_sum = 0;
        for(int i=0;i<n;i++)
        {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);
        return (Math.max(max_circular, max_normal));
    }
    public static void main(String[] args){
        int a[] = {10, -3, -4, 7, 6, 5, -4, -1} ;
        System.out.print(circularMaxSum(a));
    }
}