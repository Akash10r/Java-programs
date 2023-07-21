import java.util.*;
class stock 
{
	public static void main(String[] args) 
	{
		int[] prices = {10, 4, 2, 9};
		int maxLoss = 0;
		int maxPrice = prices[0];
		for (int i = 1; i < prices.length; i++) 
		{
			if (prices[i] > maxPrice) 
			{
				maxPrice = prices[i];
			} 
			else 
			{
				int loss = maxPrice - prices[i];
				if (loss > maxLoss) 
				{
					maxLoss = loss;
				}
			}
		}
		System.out.println("The maximum loss is " + maxLoss);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
