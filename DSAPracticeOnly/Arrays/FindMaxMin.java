package Arrays;

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
       
        long max = a[0];
        long min = a[0];
        
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        
      
        
        pair minmax = new pair(min,max);
        return minmax;
        
    }
}