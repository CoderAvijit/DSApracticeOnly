package Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        
        java.util.Arrays.sort(arr);
        int answer=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int large=arr[n-1]-k;
        int mi,ma;
        for(int i=0;i<n-1;i++)
        {
            mi=Math.min(small,arr[i+1]-k);
            ma=Math.max(large,arr[i]+k);
            if(mi<0) continue;
            answer=Math.min(answer,ma-mi);
        }
        return answer;
    }
}

