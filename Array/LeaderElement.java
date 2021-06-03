public class LeaderArray{
    
    //naive approach
    public static void leaderElement(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    //efficient approach
    public static void leaderElement1(int arr[])
    {
        int n=arr.length;
        int curr_ldr = arr[n-1];
        System.out.print(curr_ldr + " ");
        for(int i=n-2;i>=0;i--)
        {
            if(curr_ldr < arr[i])
            {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int a[] = {30,20,10};
        leaderElement1(a);
    }
}