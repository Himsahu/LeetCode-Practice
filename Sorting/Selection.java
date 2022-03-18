package Sorting;

import java.util.Arrays;

public class Selection {
	
	public static void main(String [] args)
	{
		int arr [] = {4,2,5,-6,0,4};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selection ( int arr [])
	{
		for(int i =0;i<arr.length;i++)
		{
			int last = arr.length-i-1;
			int max = getMax(arr, 0, last);
			
			swap(arr, max, last);
		}
	}
	
	static int getMax(int [] arr, int start, int last)
	{
		int max = start;
		for(int i = start;i<=last;i++)
		{
			if(arr[max]<arr[i])
				max = i;
		}
		
		return max;
	}
	
	static void swap(int [] arr, int f, int s)
	{
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}
	
}
