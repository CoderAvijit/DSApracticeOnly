package Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        
        java.util.Arrays.sort(arr);
        int answer = arr[n-1]-arr[0];
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        int mi,ma;
        
        for(int i=0;i<n-1;i++)
        {
            mi = Math.min(smallest,(arr[i+1]-k));
            ma = Math.max(largest,(arr[i]+k));
            if(mi<0) continue;
            answer = Math.min(answer,ma-mi);
        }
        return answer;
    }
}

