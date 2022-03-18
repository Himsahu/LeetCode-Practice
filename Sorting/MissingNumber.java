package Sorting;

public class MissingNumber {

	public static void main(String [] args)
	{
		int arr [] = {0,3,1};
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int arr[])
	{
		int i = 0;
		
		while(i<arr.length)
		{
			int index = arr[i];
			if(arr[i]<arr.length && arr[i] != arr[index])
				swap(arr, i, index);
			
			else
				i++;
		}
		
		int j = 0;
		while(j<arr.length)
		{
			if(j != arr[j])
				return j;
			else
				j++;
		}
		return -1;
	}
	
	static void swap(int arr[], int i, int index)
	{
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
	}
}
