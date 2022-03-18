import java.util.*;

public class DungeonGame {

	public static int calculateMinimumHP(int[][] dungeon) {
		
		if(dungeon == null || dungeon.length == 0 || dungeon[0].length==0)
			return 0;
		HashMap <String, Integer> hm = new HashMap<>();
		return rec(0,0,dungeon,hm);
    }
	
	public static int rec(int i, int j, int [][] dungeon, HashMap<String,Integer> hm){
		if(i >= dungeon.length || j>=dungeon[0].length)
			return Integer.MAX_VALUE;
		
		String key = i+","+j;
		
		if(hm.containsKey(key))
			return hm.get(key);
		
		int health = Math.min(rec(i+1, j,dungeon,hm),rec(i,j+1,dungeon,hm));
		
		if(health == Integer.MAX_VALUE)
			health = 1;
		
		int result = Math.max(health-dungeon[i][j], 1);	
		hm.put(key, result);
		
		return result;
		
	}

	public static void main(String [] args) {
		
		int dungeon[][] = {
				{-2,-3,3},
				{-5,-10,1},
				{10,30,-5}
			};
		
		System.out.println(calculateMinimumHP(dungeon));
	}
}
