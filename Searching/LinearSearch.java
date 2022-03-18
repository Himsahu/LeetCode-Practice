package Searching;

public class LinearSearch {
	
	static int searchNumber (int [] arr, int x) {
		
		int index = -1;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] == x)
				index = i;
			if ( i ==arr.length && index == -1)
				System.out.println("No number found");
		}
		return index;
	}
	
	public static void main (String [] args)
	{
		int arr [] = {1,4,56,3,12};
		int search = 12;
		
		int var = searchNumber(arr, search);
		if (var == -1)
			System.out.println("No match found");
		
		else
			System.out.println(var);
	}
}
