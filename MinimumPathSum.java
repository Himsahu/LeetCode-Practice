 //https://leetcode.com/problems/minimum-path-sum/
import java.util.*;

public class MinimumPathSum {
	
	public static int minPathSum(int[][] grid) {
		
		if(grid == null||grid.length==0||grid[0].length==0)
			return 0;
		
		HashMap <String, Integer> hm = new HashMap<>();
		return sum(0,0,grid,hm);
    }
	
	public static int sum(int i,int j, int [][] grid, HashMap<String,Integer> hm){
		
		if(i>=grid.length || j >=grid[0].length)
			return Integer.MAX_VALUE;
		
		String key = i+","+j;
		
		if(hm.containsKey(key))
			return hm.get(key);
		
		int total = Math.min(sum(i+1,j,grid,hm), sum(i,j+1,grid,hm));
		
		if(total == Integer.MAX_VALUE)
			total = 0;
		
		int ans = Math.max(total+grid[i][j], 0);
		hm.put(key, ans);
		
		return ans;
	}

	public static void main(String [] args)
	{
		int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
		
		System.out.println(minPathSum(grid));
	}
}
