package Arrays;

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long currSum=0;
        long maxSum=0;
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            currSum +=arr[i];
            
            if(currSum>maxSum)
            {
                maxSum = currSum;
            }
            
            if(currSum<0)
            {
                currSum =0;
            }
            
            if(arr[i]<0)
            {
                count++;
            }
        }
        
        if(n==count)
        {
            java.util.Arrays.sort(arr);
            maxSum = arr[n-1];
        }
        return maxSum;
    }
    
}
