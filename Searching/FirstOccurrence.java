public class FirstOccurrence{
    
    //iterative approach
    public static int firstOccur(int arr[], int x)
    {
        int n = arr.length;
        int low=0, high=n-1;
        while(low <= high)
        {
            int mid=(low+high) / 2;
            if(arr[mid] > x)
                high = mid-1;
            else if(arr[mid] < x)
                low = mid + 1;
            else 
            {
                if(mid == 0 || arr[mid] != arr[mid-1])
                    return mid;
                else 
                    high = mid - 1;
            }
        }
        return 0;
    }
    
    //recursive approach
    public static int firstOccurrence(int arr[], int low, int high, int x)
    {
        if(low > high)
            return 0;
        int mid = (low+high) / 2;
        if(arr[mid] > x)
            return firstOccurrence(arr, low, mid-1,x);
        else if(arr[mid] < x)
            return firstOccurrence(arr, mid+1, high, x);
        else
        {
            if(mid == 0 || arr[mid] != arr[mid-1])
                return mid;
            else
                return firstOccurrence(arr,low,mid-1,x);
        }
    }
    public static void main(String[] args){
        int[] a = {10,10,20,20,20,30,30,40,40};
        System.out.println(firstOccurrence(a,0,a.length - 1,40));
    }
}
