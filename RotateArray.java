import java.util.*;

public class RotateArray {
	
	static void rotate(int [] nums, int k)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		int start = 0;
		int end = nums.length;
		int count = 0;
		int count2=0;
		
		while (start < end) {
			if(count < k)
			{
				list.add(nums[end-k+count]);
				count++;
			}
			else
			{
				list.add(nums[count2]);
				count2++;
			}
			start++;
		}
		
		System.out.print(list+"");
	}
	public static void main (String [] args) {
		int k = 3;
		int arr [] = {1,2,3,4,5,6,7};
		rotate(arr, k);
		
	}
}
