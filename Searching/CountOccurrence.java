public class CountOccurrence{
    
    //naive approach
    public static int countOccur(int arr[], int x)
    {
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
                count++;
        }
        return count;
    }
    
    //efficient approach
    
    //index of first occurrence of a number
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
                    high = mid + 1;
            }
        }
        return 0;
    }
    
     //index of last occurrence of a number
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
    
    public static int countOccurence(int arr[], int x)
    {
        int n=arr.length;
        int first = firstOccur(arr,x);
        if(first == 0)
            return 0;
        else
            return (lastOccur(arr,x)-first + 1);
    }
    public static void main(String[] args){
        int[] a = {10,10,20,20,20,30,30};
        System.out.println(countOccurence(a, 20));
    }
}