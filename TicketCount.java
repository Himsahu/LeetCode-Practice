import java.util.*;

public class TicketCount {

	public static int containsDuplicate(int[] nums) {       

		if(nums.length == 1)
            return nums[0];
        
        else
        {
            
            int start = 0;
            int end = 1;
            int max=0;
            int sum =0;
            
            while(start<nums.length)
            {
            	max += nums[start];
            	start++;
            }
            
            while (start < end)
            {
              sum = nums[start]+nums[end];
                
                if(end < nums.length-1)
                    end++;
                
                else
                    start++;
                
                if(sum > max)
                    max = sum;
            }
            
            int len = nums.length-1;
            while(start < end)
            {
            	sum = nums[start]+nums[len];
            	
            	if(start<nums.length-1 && nums.length>=0)
            	{
            		start++;
            		len--;
            	}
            	if(sum > max)
                    max = sum;
            }
            return max;
        }
	}
	
	public static void main(String [] args)
	{
		
		int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(containsDuplicate(nums));
	}
}


//2,6,1,3