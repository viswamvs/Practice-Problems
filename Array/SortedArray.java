public class Main
{
    //naive approach
    public static boolean isSorted(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[i])
                    return false;
        }
        return true;
    }
    
    //efficient approach
    public static boolean isSort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		int a[] = {14,22,24,56,78,2};
		System.out.println(isSort(a));
	}
}
