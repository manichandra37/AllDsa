package FactorialOfNumber;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num = myObj.nextInt();

		System.out.print("Number of digits : " + factorial(num));

	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub

		int ans = 1;

		for (int i = 1; i <= num; i++) {

			ans = ans * i;

		}

		return ans;
	}

}
