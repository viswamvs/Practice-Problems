public class MissingNumber{
    
    public static int missingNum(int arr[])
    {
        int n = arr.length;
        int res=0;
        int res1=arr[0];
        for(int i=1;i<=n+1;i++)
        {
            res = res ^ i;
        }
        for(int i=1;i<n;i++)
        {
            res1 = res1 ^ arr[i];
        }
        return (res ^ res1);
    }
    public static void main(String[] args){
        int[] arr = {1,4,3,2};
        System.out.println(missingNum(arr));
    }
}