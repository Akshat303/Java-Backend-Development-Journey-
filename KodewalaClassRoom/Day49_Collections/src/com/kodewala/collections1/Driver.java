package com.kodewala.collections1;

public class Driver
{

	public static void main(String[] args)
	{
		// 1. store the price --> container {box} which holds integer value
		int price[] = { 100, 300, 560, 5689, 7009 };

		// 2. process --> find the price value above 1000
		for (int i = 0; i < price.length; i++)
		{
			int currentPrice = price[i];

			if (currentPrice > 1000)
			{
				System.out.println(currentPrice);
			}
		}

	}

}
