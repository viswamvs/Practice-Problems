public class BonnaciSeries {
    
    //naive solution
    public static void bonacciNum(int n, int m)
    {
        int a[] = new int[m];
        for(int i=0;i<n;i++)
            a[i] = 0;
        a[n-1] = 1;
        a[n] = 1;
        for(int i=n+1;i<m;i++)
        {
            for(int j=i-n;j<i;j++)
            {
                a[i] += a[j];
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    //efiicient solution
    public static void bonacci(int n, int m)
    {
        int[] a = new int[m];
        for(int i=0;i<n-1;i++)
        {
            a[i] = 0;
        }
        a[n-1] = 1;
        a[n] = 1;
        for(int i=n+1;i<m;i++)
        {
            a[i] = a[i-1]+a[i-1] - a[i-n-1];
        }
        for(int i=0;i<m;i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args){
        bonacciNum(3,8);
    }
}