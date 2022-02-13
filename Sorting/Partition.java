import java.io.*;

class GFG {
    
    //naive partition
    public static void naivePartition(int arr[], int l, int h, int p)
    {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for(int i=l;i<h;i++)
        {
            if(arr[i] < arr[p])
            {
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[p];
        for(int i=l;i<h;i++)
        {
            if(arr[i] > arr[p])
            {
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(temp[i] + " ");
    }
    
    //swap function
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    //lomuto partition
    public static int lomutoPartition(int a[])
    {
        int n = a.length;
        int low = 0, high = n-1;
        int pivot = a[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++)
        {
            if(a[j] < pivot)
            {
                i++;
                swap(a[i],a[j]);
            }
        }
        swap(a[i+1], a[high]);
        return (i+1);
    }
    
    //hoare partition
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
	public static void main (String[] args) {
		int[] a = {5,3,8,4,2,7,1,10};
		System.out.print(hoare(a,0,a.length-1));
	}
}
