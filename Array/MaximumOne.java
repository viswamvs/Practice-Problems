public class MaxConsectiveOne{
    
    //naive approach
    public static int MaxConsective(int arr[])
    {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            int curr=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j] == 1)
                    {
                        curr++;
                        res = Math.max(res,curr);
                    }
                else
                    break;
            }
        }
        return res;
    }
    
    //efficient approach
    public static int MaxConsective1(int arr[])
    {
        int n=arr.length;
        int res=0, cur=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
                cur=0;
            else 
            {
                cur++;
                res = Math.max(res, cur);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,0,1,1,1,1,0,1,1};
        System.out.print(MaxConsective1(arr));
    }
}