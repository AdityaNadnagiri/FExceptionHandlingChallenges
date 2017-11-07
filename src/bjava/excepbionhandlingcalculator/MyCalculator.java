package bjava.excepbionhandlingcalculator;

class MyCalculator {
	public static int pow(int n, int p) throws Exception {
		int q=n;
		
	
			if(p==0&&n!=0) 
			{
				return 1;
			}
			else if(p>0||n>0) 
			{
				for (int i = 1; i < p; i++)
				{
					q =q* n;
				}
			} 
			else if(n<0||p<0) {
				throw new Exception("n or p should not be negative.");
			}
			else if(n==0&&p==0) 
			{
				throw new Exception("n and p should not be zero"); 
			}
			return q;
	}
}
