// To find the closest 
public class Ceiling {
	
	static char number(char [] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int mid = start + (end-start)/2;
			
			if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}	
		}
		return arr[start];
	}
	
	public static void main(String [] args)
	{
		char arr[] = {'c','d','f'};
		char target = 'g';
		if (target == 'z')
			System.out.println('a');
		else
			System.out.println(number(arr,target));
	}
}
