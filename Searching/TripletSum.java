public class Solution{
    
    //pair sum (two pointer approach)
    public static boolean isPair(int arr[], int left, int right, int x)
    {
        while(left < right)
        {
            if(arr[left]+arr[right] == x)
                return true;
            else if(arr[left]+arr[right] > x)
                right--;
            else
                left++;
        }
        return false;
    }
    public static boolean isTriplet(int arr[], int x)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(isPair(arr, i+1, n-1, x-arr[i]))
                return true;
        }
        return false;
    }
    public static void main (String[] args) {
        int[] a = {2,3,4,8,9,20,40};
        System.out.println(isTriplet(a, 32));
    }
}