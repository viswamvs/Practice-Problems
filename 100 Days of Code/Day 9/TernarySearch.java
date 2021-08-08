//ternary search

public class Main{
    
    static int ternarySearch(int[] arr, int l, int r, int key)
    {
        if(r >= l)
        {
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;
            if(arr[mid1] == key)
                return mid1;
            if(arr[mid2] == key)
                return mid2;
            if(key < arr[mid1])
                ternarySearch(arr,l,mid1-1, key);
            else if(key > arr[mid2])
                ternarySearch(arr, mid2+1, r, key);
            else
                ternarySearch(arr,mid1+1,mid2-1,key);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ternarySearch(a,0,9,6));
    }
}