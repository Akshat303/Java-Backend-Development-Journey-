class Solution 
	{
		static void closestNumber(int n, int m) 
		{
			int  div = 0 ;
			div = n % m;
			if (div == 0) 
			{
				System.out.print (n);
			}else
			{
				System.out.print (n+div);
			}
			
		}
		
		public static void main(String args[])
		{
			closestNumber(5,6);
		}
		
	}


