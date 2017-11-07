package aExceptionHandlingTryCatch;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int x = input.nextInt();
			int y = input.nextInt();
			int k = x / y;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
		input.close();
	}
}