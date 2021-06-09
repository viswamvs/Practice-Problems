public class MaximumFrequency{
    
    public static void maxFreq(int arr[])
    {
        int n=arr.length;
        int i=1, freq=1;
        while(i<n)
        {
            while((i<n) && (arr[i] == arr[i-1]))
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1] != arr[n-2])
            System.out.println(arr[n-1] + " " + freq);
    }
    public static void main(String[] args)
    {
        int[] arr = {10,10,10,20,30};
        maxFreq(arr);
    }
}