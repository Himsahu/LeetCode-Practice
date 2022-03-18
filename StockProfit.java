//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class StockProfit {
	 public static int maxProfit(int[] prices) {
	 
		 int  min = prices[0];
		 int i = 0;
		 int k = 0;
		 
		 while(i<prices.length)
		 {
			 if(min>=prices[i] && prices[i] != prices[prices.length-1] )
			 {
				 min = prices[i];
				 k = i;
				 i++;
			 }			 
			 
			 else
				 i++;
		 }
		 
		 int max = prices[k];
		 
		 
		 for(int start = k; start<prices.length;start++)
		 {
			 if(max < prices[start])
			 {
				 max = prices[start];
			 }				 
		 }		 
		 return max-prices[k];
	    }
	 
	 public static void main(String [] args)
	 {
		 int prices [] = {2,4,1};
		 System.out.println(maxProfit(prices));
	 }
}
