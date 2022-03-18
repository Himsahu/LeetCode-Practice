import java.util.*;

public class Fibonacci {

	  public static int getNthFib(int n) {
	   
		  int arr [] = new int [n];
			
			int last;
			
			if(n==1)
				{
					last = 0;
					return last;
				}
			else if(n==2)
				{
					last = 1;
					return last;
				}
			
			int i = n-2;
			
			while(i>0)
			{
					arr[0]=0;
					arr[1]=1;
					
					arr[n-i] = arr[n-i-2] + arr[n-i-1];
					i--;
			}
			
			last = arr[n-1];

	    return last;
	  }
	  
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(getNthFib(n));
	}
}
