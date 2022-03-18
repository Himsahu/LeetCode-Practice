//Find the largest number in the array
// 123531 -> 5 Ans


package Searching;

public class MountainArray {
	
	public static void main (String [] args)
	{
		int arr [] = {1,2,4,5,6,4,3,2};
		System.out.println(peakIndexInMountain(arr));
	}
	
	public static int peakIndexInMountain(int [] arr)
	{
		int start =0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int mid = start + (end-start)/2;
			
			if(arr[mid] > arr[mid+1]){
				end = mid;
			}
			else {
				start = mid+1;
			}
			
		}
		
		return start;
	}
}
