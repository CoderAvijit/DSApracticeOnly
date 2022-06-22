package Arrays;

class Compute {
    
    public void rotate(int arr[], int n)
    {
       
        
       int newArr[] = new int[n];
       for(int i=0;i<n;i++)
       {
           newArr[i] = arr[i];
       }
       
      
       arr[0] = newArr[n-1];
       
       for(int i=1;i<n;i++)
       {
           arr[i] = newArr[i-1];
       }
        
    }
}
