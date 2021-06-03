public class LeftRotate {
    
    public static void leftRotate(int arr[])
    {
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    //naive approah
    public static void leftRotate1(int arr[], int d)
    {
        for(int i=0;i<d;i++)
        {
            leftRotate(arr);
        }
    }
    
    //second approach
    public static void leftRotate2(int arr[], int d)
    {
        int n=arr.length;
        int temp[] = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            arr[n-d+i] = temp[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    //reversal approach
    public static void reverse(int arr[], int low,int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    
    public static void leftRotate3(int arr[], int d)
    {
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        leftRotate3(a,2);
    }
}