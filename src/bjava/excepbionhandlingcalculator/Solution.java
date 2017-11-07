package bjava.excepbionhandlingcalculator;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) throws Exception 
	{

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p = input.nextInt();
		input.close();
		System.out.println(MyCalculator.pow(n,p));

	}

}
