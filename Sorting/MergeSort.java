public class MergeSort{
    
    //merge function
    public static void merge(int arr[], int l, int mid, int r)
    {
        int n1 = mid-l+1; int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = arr[l+i];
        for(int i=0;i<n2;i++)
            right[i] = arr[mid+1+i];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
        }
        while(i<n1)
        {
            arr[k++] = left[i++];
        }
        while(j<n2)
        {
            arr[k++] = right[j++];
        }
    }
    
    //merge sort
    public static void mergeSort(int arr[], int l, int r)
    {
        if(r>l)
        {
            int m = l + ((r-l) / 2);
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    
    //print array
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] a = {10,5,30,15,7};
        mergeSort(a,0,4);
        printArray(a);
    }
}