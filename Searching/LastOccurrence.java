public class LastOccurrence{
    
    //iterative approach
    public static int lastOccur(int arr[], int x)
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
                if(mid == n-1 || arr[mid] != arr[mid+1])
                    return mid;
                else 
                    low = mid + 1;;
            }
        }
        return 0;
    }
    
    //recursive approach
    public static int lastOccurrence(int arr[], int low, int high, int x, int n)
    {
        if(low > high)
            return 0;
        int mid = (low+high) / 2;
        if(arr[mid] > x)
            return lastOccurrence(arr, low, mid-1,x,n);
        else if(arr[mid] < x)
            return lastOccurrence(arr, mid+1, high, x,n);
        else
        {
            if(mid == n-1 || arr[mid] != arr[mid+1])
                return mid;
            else
                return lastOccurrence(arr,mid+1,high,x,n);
        }
    }
    public static void main(String[] args){
        int[] a = {10,10,20,20,20,30,30,40,40};
        System.out.println(lastOccurrence(a,0,a.length - 1,40,a.length));
    }
}