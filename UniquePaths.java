import java.util.*;

public class UniquePaths {
	
    public static int uniquePaths(int m, int n) {
        
    	int UpperBound = m + n - 2; // (0,0) - (m-1,n-1) => (m - 1) + (n - 1) 
    	int lowerBound = m - 1; // LowerBound either m - 1 or n - 1
    	double paths = 1;
    	for(int i = 1; i <= lowerBound; i++) {
    		paths = paths * (UpperBound - lowerBound + i) / i;
    	}
    	
    	return (int)paths;    
    	
    }
    
     
	public static void main(String [] args)
	{
		int m = 3;
		int n = 7;
		
		System.out.println(uniquePaths(m,n));
	}
}
