public class SubArray{
    
    //naive approach
    public static int subArray1(int arr[], int k)
    {
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++)
        {
            int sum=0;
            for(int j=0;j<k;j++)
            {
                sum += arr[i+j];
            }
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
    
    //efficient approach
    public static int subArray2(int arr[], int k)
    {
        int n=arr.length;
        int max_sum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum += arr[i];
            max_sum = sum;
        }
        for(int i=k;i<n;i++)
        {
            sum += arr[i] - arr[i-k];
        }
        max_sum = Math.max(sum, max_sum);
        return max_sum;
    }
    public static void main(String[] args)
    {
        int[] a ={100,200,300,400};
        System.out.print(subArray2(a,2));
    }
}