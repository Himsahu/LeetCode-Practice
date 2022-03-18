import java.util.Arrays;

//Product of Array Except Self

public class ProductOfArrayElement {
	
	public static int [] product(int [] nums) {
		
		int out [] = new int[nums.length];
		out[0] = 1;
		
		for(int i =1;i<nums.length;i++)
		{
			out[i] = nums[i-1]*out[i-1];
		}
		
		int r = 1;
		
		for(int i = nums.length-1;i>=0;i--)
		{
			out[i] = out[i]*r;
			r = r*nums[i];
		}
		
		return out;
	}
	
	public static void main(String [] args)
	{
		int nums [] = {1,2,3,4};
		System.out.println(Arrays.toString(product(nums)));
	}
}
