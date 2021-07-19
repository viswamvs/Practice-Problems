import java.io.*;

class GFG {
    
    //naive solution
    public static void intersection(int a[], int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            for(int j=0;j<b.length;j++)
            {
                if(a[i] == b[j])
                {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
    
    //efficient solution
    public static void intersection1(int a[], int b[])
    {
        
    }
	public static void main (String[] args) {
		int[] a = {1,1,3,3,3,5};
		int[] b = {1,1,1,1,3,5,7};
		intersection(a,b);
	}
}