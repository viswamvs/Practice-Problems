import java.util.*;
import java.io.*;

public class GFG{
    
    //naive solution
    public static void countFrequency(int[] arr)
    {
        int n = arr.length;
        Arrays.sort(arr);
        int freq = 1, i = 1;
        while(i < n)
        {
            while(i<n && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }
        if(n==1 || arr[n-1] != arr[n-2])
            System.out.println(arr[n-1] + " " + freq);
    }
    
    //efficient solution
    public static void countFrequency1(int[] arr)
    {
        LinkedHashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();
        for(int x : arr)
            h.put(x, h.getOrDefault(x,0) + 1);
        for(Map.Entry<Integer,Integer> e : h.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
    
    public static void main (String[] args) {
        int[] arr = {10,20,10,20,30};
        countFrequency1(arr);
    }
}