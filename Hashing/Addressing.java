/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MyHash {
    int[] arr;
    int size, cap;
    
    MyHash(int c)
    {
        cap = c;
        size = 0;
        arr = new int[cap];
        for(int i=0;i<c;i++)
            arr[i] = -1;
    }
    
    int Hash(int k)
    {
        return k % cap;
    }
    
    boolean search(Integer key)
    {
        int h = Hash(key);
        int i = h;
        while(arr[i] != -1)
        {
            if(arr[i] == key)
                return true;
            i = (i+1) % cap;
            if(i == h)
                return false;
        }
        return false;
    }
    
    boolean insert(Integer key)
    {
        int h = Hash(key);
        int i = h;
        if(size == cap)
            return false;
        while(arr[i] != -1 && arr[i] != -2 && arr[i] != key)
            i = (i+1) % cap;
        if(arr[i] == key)
            return false;
        else
        {
            arr[i] = key;
            size++;
            return true;
        }
    }
    
    boolean delete(Integer key)
    {
        int h = Hash(key);
        int i = h;
        while(arr[i] != -1)
        {
            if(arr[i] == key)
            {
                arr[i] = -2;
                return true;
            }
           
            i = (i+1) % cap;
            if(i == h)
                return false;
        }
        return false;
    }
}

class GFG{
	public static void main (String[] args) {
	 MyHash mh = new MyHash(7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.delete(56);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
}