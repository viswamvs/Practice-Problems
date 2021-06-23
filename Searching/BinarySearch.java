public class BinarySearch{
    
    //iterative approach
    public static int binarySearch(int arr[], int x)
    {
        int n=arr.length;
        int low = 0, high = n-1;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] >x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
    
    //recursive approach
    public static int binSearch(int arr[], int low, int high, int x)
    {
        if(low > high)
            return -1;
        int mid = (low + high) / 2;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            return binSearch(arr, low, mid-1, x);
        else
            return binSearch(arr, mid+1, high, x);
    }
    public static void main(String[] args){
        int[] a = {10,20,30,40,50,60,70};
        System.out.println(binSearch(a, 0, a.length - 1, 25));
    }
}