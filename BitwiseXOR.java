import java.util.*;

public class BitwiseXOR {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int arr [] = {2,4,6,8,10};
		
		int n = arr.length;
		
		int xor=0;
		for(int i=0;i<n;i++)
		{
			xor = xor^arr[i];
			
			System.out.println(arr[i]+" "+xor); 
		}
		
		System.out.print(xor);
	}
	
	
}
