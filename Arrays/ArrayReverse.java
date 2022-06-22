package Arrays;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayReverse {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
    		int N = sc.nextInt();
    		int arr[] = new int[N];
    		for(int i=0;i<N;i++)
    		{
    		    arr[i] = sc.nextInt();
    		}
    		
    // 		int low = 0;
    // 		int high = N-1;
    		
    // 		while(low<=high)
    // 		{
    // 		   int temp = arr[low];
    // 		   arr[low] = arr[high];
    // 		   arr[high] = temp;
    // 		   low++;
    // 		   high--;
    		   
    // 		}
    		
    		for(int i=N-1;i>=0;i--)
    		{
    		    System.out.print(arr[i]+" ");
    		}
    		System.out.println();
    		
    		
    		
		}
	}
}