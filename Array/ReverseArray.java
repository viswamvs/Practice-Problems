public class ReverseArray {
    
    public static void reverseArray(int[] arr)
    {
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        reverseArray(a);
    }
}