/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int repeatingElements(int[] arr)
    {
        int slow = arr[0], fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
	public static void main (String[] args) {
		int[] a = {1,3,4,2,2};
		System.out.println(repeatingElements(a));
	}
}