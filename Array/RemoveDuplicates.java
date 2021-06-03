public class RemoveDuplicates {
    
    //naive approach
   public static int remove(int arr[])
   {
       int n=arr.length;
       int[] temp = new int[n];
       temp[0] = arr[0];
       int res=1;
       for(int i=1;i<n;i++)
       {
           if(temp[res-1]!=arr[i])
           {
               temp[res]=arr[i];
               res++;
           }
       }
       for(int i=0;i<res;i++)
       {
           arr[i] = temp[i];
           System.out.print(arr[i] + " ");
       }
       return res;
   }
   
   //efficient approach
   public static int removeDup(int arr[])
   {
       int n=arr.length;
       int res=1;
       for(int i=0;i<n;i++)
       {
           if(arr[i]!=arr[res-1])
           {
               arr[res] = arr[i];
               res++;
           }
       }
       for(int i=0;i<res;i++)
       {
           System.out.print(arr[i] + " ");
       }
       return res;
   }
  
    public static void main(String[] args){
        int a[] = {1,1,2,2,3,3,4,4};
        System.out.print(removeDup(a));
    }
}