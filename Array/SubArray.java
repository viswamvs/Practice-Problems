public class MaxSubArray{
    
    //naive approach
    public static boolean subArray1(int arr[], int sum)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int curr_sum = 0;
            for(int j=i;j<n;j++)
            {
                curr_sum += arr[j];
                if(curr_sum == sum)
                    return true;
            }
        }
        return false;
    }
    
    //efficient approach
    public static boolean subArray2(int arr[], int sum)
    {
        int n=arr.length;
        int s=0;
        int curr_sum=arr[0];
        for(int i=1;i<=n;i++)
        {
            while((curr_sum > sum) && (s<i-1))
            {
                curr_sum -= arr[s];
                s++;
            }
            if(curr_sum == sum)
                return true;
            if(i < n)
                curr_sum += arr[i];
        }
        return (curr_sum == sum);
    }
    public static void main(String[] args)
    {
        int[] a = {100,200,300,400};
        System.out.print(subArray2(a,700));
    }
}