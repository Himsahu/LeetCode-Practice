//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {
	static int[] twoSum(int[] nums, int target) {

		int[] output= new int[2]; //creating an array
	    for(int i=0;i<nums.length;i++){
	        for(int j=i+1;j<nums.length;j++){
	            if(nums[i]+nums[j]==target){
	               output[0]=i; 
	            output[1]=j;
	            }
	        }
	    }
	    return output;
	}
	public static void main(String [] args)
	{
		int arr [] = {3,2,3};
		int target = 6;
		int sol [] = twoSum(arr,target);
		for(int i=0;i<sol.length;i++)
		{
			System.out.print(sol[i]+" ");
		}
		
	}

}
