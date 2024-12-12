package Gcd;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();

		System.out.print("Number of digits : " + gcd(num1, num2));

	}

	private static int gcd(int num1, int num2) {

		int res = Math.min(num1, num2);

		while (res > 0) {

			// we are checking from the top to bottom as this is GCD
			// if we get the bigger one that is the gcd
			if (num1 % res == 0 && num2 % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}
}
