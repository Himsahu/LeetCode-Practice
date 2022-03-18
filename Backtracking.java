import java.util.Arrays;

//Getting all the location in a maze using backtracking

public class Backtracking {
	
public static void main(String [] args)
	{
		boolean [][] maze= {
				{true, true,true},
				{true, true,true},
				{true, true,true}
				};
		
		allPaths("",maze,0,0);
		
		int path [][]= new int[maze.length][maze[0].length];
		allPathsPrints("", maze, 0,0, path, 1);
	}
	
public static void allPaths(String p , boolean [][] maze, int r , int c){
		
		if(r == maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		
		if(r<maze.length-1) {
			allPaths(p+'D', maze, r+1, c);
		}
		
		if(c<maze.length-1) {
			allPaths(p+'R', maze, r, c+1);
		}
		
		if(r>0) {
			allPaths(p+'U', maze, r-1,c);
		}
		
		if(c>0) {
			allPaths(p+'L',maze, r, c-1);
		}
		
		maze[r][c] = true;
	}
	
public static void allPathsPrints(String p , boolean [][] maze, int r , int c, int [] []paths, int step){
		
		if(r == maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			
			for(int arr[] : paths) {
				System.out.println(Arrays.toString(arr));
			}
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		paths[r][c] = step;
		
		if(r<maze.length-1) {
			allPathsPrints(p+'D', maze, r+1, c, paths, step+1);
		}
		
		if(c<maze.length-1) {
			allPathsPrints(p+'R', maze, r, c+1, paths, step+1);
		}
		
		if(r>0) {
			allPathsPrints(p+'U', maze, r-1,c, paths, step+1);
		}
		
		if(c>0) {
			allPathsPrints(p+'L',maze, r, c-1, paths, step+1);
		}
		paths[r][c] = 0;
		maze[r][c] = true;

	}

}
