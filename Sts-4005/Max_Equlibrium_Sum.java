import java.io.*;
import java.util.Scanner;
public class Max_Equlibrium_Sum {
    static int findMaxSum(int []arr, int n)
	{
		int res = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++)
		{
			int prefix_sum = arr[i];
			
			for (int j = 0; j < i; j++)
				prefix_sum += arr[j];
		
			int suffix_sum = arr[i];
			
			for (int j = n - 1; j > i; j--)
				suffix_sum += arr[j];
		
			if (prefix_sum == suffix_sum)
				res = Math.max(res, prefix_sum);
		}
		
		return res;
	}
    public static void main (String[] args)
	{
		Scanner S =new Scanner(System.in);
		int arr[] = new int[S.nextInt()];
		int n = arr.length;
		for(int i=0; i< n; i++){
			arr[i] = S.nextInt();
			
		}
		System.out.println(findMaxSum(arr, n));
	}


}