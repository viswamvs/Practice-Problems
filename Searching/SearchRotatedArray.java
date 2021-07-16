public class SearchArray{
    
    //efficient solution
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        int low=0, high=n-1;
        while(low <= high)
        {
            int mid=(low+high)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > arr[low])
            {
                if(x>=arr[low] && x < arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else
            {
                if(x>arr[mid] && x<= arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] a = {100,500,10,20,30,40,50};
        System.out.println(search(a,500));
    }
}