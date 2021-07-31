import java.util.*;

public class MinMaxElement{

    //naive solution
    public static ArrayList<Integer> minMaxElement(int[] arr)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        Arrays.sort(arr);
        l.add(arr[0]);
        l.add(arr[arr.length - 1]);
        return l;
    }
    
    //efficient solution
    public static ArrayList<Integer> minMaxElement1(int[] arr)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = arr.length;
        int min = arr[0], max = arr[0];
        for(int i=1;i<n;i++)
        {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        al.add(min);
        al.add(max);
        return al;
    }
    
    public static void main (String[] args) {
        int[] a = {1,2,4,5,-3,91};
        System.out.println(minMaxElement1(a));
    }
}