package Arrays;
 public class MoveAllNegatives {
    
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int a[]=new int[n];
       int b[]=new int[n];
       int t1=0;
       int t2=0;
       for(int i=0;i<n;i++){
           if(arr[i]>=0){
               a[t1]=arr[i];
               t1++;
           }else{
               b[t2]=arr[i];
               t2++;
           }
       }
       for(int i=0;i<t1;i++){
           if(i+1<=t1){
               arr[i]=a[i];
           }else{
               arr[i]=b[i-t1];
           }
     
        }
        
    }

    public static void main(String args[])
    {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;
        segregateElements(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
