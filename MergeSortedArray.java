
public class MergeSortedArray {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	     
		 int[] res=new int[n+m];
	        int n1=0,n2=0,ind=0;
	        
	        while(n1!=m && n2!=n){
	            if(nums1[n1] < nums2[n2])
	                res[ind++] = nums1[n1++];
	            else 
	            	res[ind++] = nums2[n2++];
	        }
	        
	        if(n1==m)
	            for(int i=ind; i<(n+m); i++){
	                res[i]=nums2[n2++];
	            }
	        else
	            for(int i=ind; i<(n+m); i++){
	                res[i]=nums1[n1++];
	            }
	        
	        for(int i=0; i<(n+m); i++)
	            nums1[i]=res[i];		 
	
	    }
	 
	 public static void main(String [] args)
	 {
		 int nums1 [] = {1,2,3,0,0,0};
		 int m = 3;
		 int nums2 [] = {2,5,6};
		 int n = 3;
		 
		 merge(nums1, m, nums2, n);

	 }
}
