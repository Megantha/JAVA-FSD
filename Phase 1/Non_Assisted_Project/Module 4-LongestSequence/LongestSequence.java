package Matrix;

import java.util.*;
import java.util.Scanner;


public class LongestSequence {
	static int max_ref;
    static int _longestIncreasingSubsequences(int arr[], int n)
    {
        if (n == 1)
            return 1;
        int res, max_ending_here = 1;
 
        for (int i = 1; i < n; i++) {
            res = _longestIncreasingSubsequences(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
        return max_ending_here;
    }
    static int longestIncreasingSubsequences(int arr[], int n)
    {
        max_ref = 1;
        _longestIncreasingSubsequences(arr, n);
        return max_ref;
    }
    public static void main(String args[])
    {
    int n;
    Scanner scanner =new Scanner(System.in);
    System.out.println("enter the number:");
    n=scanner.nextInt();
    System.out.println("Please enter a array of "+n+":" );
        int Arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        Arr[i]=scanner.nextInt();
       
        }
           System.out.println("The Length of longestIncreasingSubsequences is :"
                           + _longestIncreasingSubsequences(Arr, n) + "\n");
    }
	
	
		
}


