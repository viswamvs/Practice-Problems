public class QuickSort{
    
    //lomuto partition
    public static int lomuto(int arr[], int l, int h)
    {
        int pivot = arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int t = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = t;
        return (i+1);
    }
    
    //hoare's partition
    static int hoare(int arr[], int l, int h)
    {
        int pivot = arr[l];
        int i=l-1, j=h+1;
        while(true)
        {
        do{
            i++;
        }while(arr[i]<pivot);
        
        do{
            j--;
        }while(arr[j]>pivot);
        
        if(i>=j)return j;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    }
    
    //quick sort using lomuto partition
    public static void quickSort(int arr[], int l, int h)
    {
        if(l<h)
        {
            int p = lomuto(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
    
    //quick sort using hoare's partition
    public static void qSort(int arr[], int l, int h)
    {
        if(l < h)
        {
            int p = hoare(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
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
        int[] a = {8,4,7,9,3,10,5};
        int n = a.length;
        qSort(a,0,n-1);
        printArray(a);
    }
}