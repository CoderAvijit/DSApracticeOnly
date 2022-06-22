package Arrays;

import java.util.*;

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
    HashSet<Integer> set = new HashSet<Integer>();
      for(int i=0;i<n;i++)
          set.add(a[i]);
      for(int i=0;i<m;i++)
          set.add(b[i]);
      
      return set.size();
    
    
    // int count=0;
    
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         if(a[i]==b[j] )
    //         {
    //             count++;
    //         }
    //     }
        
    // }
    // int rest = m+n-count;
    // return rest;
    }
}

