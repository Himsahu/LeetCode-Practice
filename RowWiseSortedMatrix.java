//Find a common element in all rows of a given row-wise sorted matrix
import java.util.*;

public class RowWiseSortedMatrix {

	public static int findCommonElement(int [][] mat)
	{
		HashMap <Integer,Integer> hs = new HashMap<>();
		
		int m = mat.length;
		int n = mat[0].length;
		
		for(int i=0;i<m;i++)
		{
			if(hs.containsKey(mat[i][0])){
				hs.put(mat[i][0], hs.get(mat[i][0])+1);
			}
			
			else{
				hs.put(mat[i][0], 1);
			}
			
			for(int j=1;j<n;j++)
			{
				if(hs.containsKey(mat[i][j])) {
					hs.put(mat[i][j], hs.get(mat[i][j])+1);
				}
				
				else {
					hs.put(mat[i][j], 1);
				}
			}
		}
		
		for(Map.Entry<Integer,Integer> ele : hs.entrySet()) {
			if(ele.getValue()==m)
				return ele.getKey();
		}
		
		return -1;
	}
	
	public static void main(String [] args)
	{
		int mat [][] = {{1, 2, 3, 4, 5},
                {2, 4, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9}};
		
		int result = findCommonElement(mat);
		
		if(result == -1)
			System.out.println("No Element Find");
		
		else
			System.out.println(result);
	}
}
