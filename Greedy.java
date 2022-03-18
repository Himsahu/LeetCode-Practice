import java.io.*;

import java.util.*;

public class  Greedy  {

	public static void main(String[] args) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstLine = read.readLine().split(" ");

		int totalItemBuy = Integer.parseInt(firstLine[0]);
		int totalAmount = Integer.parseInt(firstLine[1]);

		String[] secondLine = read.readLine().split(" ");

		int[] prices = new int[totalItemBuy];

		for (int i = 0; i < totalItemBuy; i++) {

			prices[i] = Integer.parseInt(secondLine[i]);

		}

		
		int output = getTotalByItem(prices, totalAmount);
		System.out.println(output);

	}
	
	static int getTotalByItem(int[] prices, int totalAmount) {

		int count = 0;
		int i = 0;
		Arrays.sort(prices);
		
		while(i<=prices.length-1 && totalAmount>=prices[i])
		{
			totalAmount = totalAmount-prices[i];
			i++;
			
			if(i==prices.length-1 && totalAmount > prices[0])
				i=0;
			else
				count++;
		}
		
		return count;
	}

}



