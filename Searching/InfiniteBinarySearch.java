//Infinite number Binary Search without defining the length
package Searching;

public class InfiniteBinarySearch {
	
	public static void main(String [] args) {
		
		int [] arr = {2,3,5,6,7,9,11,12,45,47,67,69,90};
		
		int target =  9;
		System.out.println(ans(arr,target));
	}
	
	static int ans(int [] arr, int target)
	{
		int start = 0;
		int end = 1;
		
		while(target > arr[end]){
			
			int newStart = end+1;
			end = end + (end-start+1) * 2;
			start = newStart;
		}
		return binarySearch(arr, target, start, end);
	}
	
	static int binarySearch(int [] arr, int target, int start, int end)
	{	
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			
			if(target < arr[mid]){
				end = mid-1;
			}
			
			else if(target> arr[mid]) {
				start = mid+1;
			}
			else 
				return mid;
		}	
		return -1;
	}
}
