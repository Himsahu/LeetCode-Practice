import java.util.*;

public class Square {
	
	public int[] sortedSquares(int[] nums) {
        int [] square = new int[nums.length];
        
        int start = 0;
        int end = nums.length;
        
        while(start < end)
        {
        	square[start] = nums[start] * nums[start];
        	start++;
        }
        Arrays.sort(square);
        return square;
    }
	
	public static void main (String [] args)
	{
		Square obj = new Square();
		int arr[] = {-4,-1,0,3,10};
		int sol [] = obj.sortedSquares(arr);
		for(int i=0;i<sol.length;i++)
		{
			System.out.print(sol[i]+" ");
		}
	}
}
