//https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
	
	static void move(int [] nums)
	{
		int pointer = 0;

	    for (int i = 0; i < nums.length; i++) {
	        if(nums[i] != 0) {
	            int temp = nums[i];
	            nums[i] = 0;
	            nums[pointer++] = temp;
	        }
	    }        
  	}
	public static void main (String [] args)
	{
		int nums [] = {0,1,0,3,12};
		move(nums);
	}
}
