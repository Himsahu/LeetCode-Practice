package Searching;

public class SearchInMountainArray {
	
	public static void main(String [] args)
	{
		int arr [] = {1,2,4,5,6,4,3,2};
		int target = 5;
		System.out.println(searchIndex(arr,target));
	}
	
	
	
	public static int searchIndex(int [] arr, int target)
	{
		
		int peak = peakArray(arr);
		int firstArray = binarySearch(arr, target, 0, peak);
		
		if(firstArray != -1)
			return firstArray;
		
		return binarySearch(arr,target, peak+1, arr.length-1);
		
	}
	
	public static int peakArray(int [] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int mid = start + (end-start)/2;
			
			if(arr[mid]>arr[mid+1])
				end = mid;
			
			else
				start = mid+1;
			
		}
		return start;
	}
	
	static int binarySearch(int arr [] , int target, int start, int end)
	{
		while(start<=end)
	    {
	        int mid=start+(end-start)/2;
	        if(arr[mid]==target)
	        {
	            return mid;
	        }
	        else if(arr[mid]<target)
	        {
	            start=mid+1;
	        }
	        else
	        {
	            end=mid-1;
	        }
	          
	    }
	    return -1;
	      
	}
	
}

