import java.util.*;

public class Seach2DMatrix {

	public static int [] searchMatrix(int[][] matrix, int target) {		

		
		int i = 0;
	    int j = matrix[0].length - 1;
	    int m = matrix.length;
	    int n = matrix[0].length;
	    		
	    while(i < m && j >= 0){
	        if(matrix[i][j] > target){
	            j--;
	        }
	        else if(matrix[i][j] < target){
	            i++;
	        }
	        else{
	            return new int[] {i,j};
	        }
	    }
	    return new int [] {-1,-1};
	  }
	
	public static void main(String [] args) {
		int matrix [][] =  {{1,3}};
		int target = 3;
		
		System.out.println(Arrays.toString(searchMatrix(matrix, target)));
	}
}



//{
//	{1,4,7,11,15},
//	{2,5,8,12,19},
//	{3,6,9,16,22},
//	{10,13,14,17,24},
//	{18,21,23,26,30}
//}