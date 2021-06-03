public class ZerosToEnd {
    
   public static int moveZeros(int arr[])
   {
       int n=arr.length;
       int count=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]!=0)
           {
               int temp=arr[i];
               arr[i]=arr[count];
               arr[count]=temp;
               count++;
           }
       }
       for(int i=0;i<count;i++)
       {
           System.out.print(arr[i] + " " + "\n");
       }
       return count;
   }
  
    public static void main(String[] args){
        int a[] = {10,0,20,0,30,0};
        System.out.print(moveZeros(a));
    }
}