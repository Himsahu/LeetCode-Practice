import java.util.Arrays;

public class IntersectionOfTwoArray {

	 public static void intersect(int[] nums1, int[] nums2) {
		 
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		 
		 int i =0,j=0,k=0;
		 
		 while(i<nums1.length && j<nums2.length)
		 {
			 if(nums1[i]<nums2[j])
				 i++;
			 
			 else if (nums1[i]>nums2[j])
				 j++;
			 
			 else
			 {
				 nums1[k++]=nums1[i++];
				 j++;
			 }
		 }
		 
		 for(int r=0;r<k;r++)
		 {
			 System.out.println(nums1[r]);
		 }
		 
	}
	 
	public static void main(String [] args)
	{
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		
		intersect(nums1, nums2);
	}
}
