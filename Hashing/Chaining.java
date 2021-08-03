/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MyHash {
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b)
    {
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++)
             table.add(new LinkedList<Integer>());
    }
    
    boolean search(Integer key)
    {
        int i = key % bucket;
        return table.get(i).contains(key);
    }
    
    void insert(Integer key)
    {
        int i = key % bucket;
        table.get(i).add(key);
    }
    
    void delete(Integer key)
    {
        int i = key % bucket;
        table.get(i).remove(key);
    }
}

class GFG{
	public static void main (String[] args) {
		MyHash m = new MyHash(7);
		m.insert(49);
		m.insert(50);
		m.insert(51);
		System.out.println(m.search(50));
		m.delete(50);
		System.out.println(m.search(50));
	}
}