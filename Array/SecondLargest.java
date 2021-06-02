public class Main
{
    //naive approach
    public static int largest(int arr[])
    {
        int res=0;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[res])
                res=i;
        }
        return res;
    }
    public static int secondLargest(int arr[])
    {
        int n = arr.length;
        int l=largest(arr);
        int res=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[l])
            {
                if(res==-1)
                    res=i;
                else if(arr[i]>arr[res])
                    res=i;
            }
        }
        return res;
    }
    
    //efficient approach
    public static int secLargest(int arr[])
    {
        int n=arr.length;
        int l=0, res=-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[l])
            { res=l;
                l=i;
               
            }
            else if(arr[i] != arr[l])
            {
                if((res == -1) || (arr[i]>arr[res]))
                    res=i;
            }
        }
        return res;
    }
    
	public static void main(String[] args) {
		int a[] = {14,23,21,70,2};
		System.out.println(secLargest(a));
	}
}
