package checkForPrime;

import java.util.Scanner;

public class CheckingForPrimeThirdtMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();

		System.out.print(checkForPrime(num1));

	}

	/*
	 * This is the most efficient method to Check for the prime number because
	 * here the number is divided by 2 and 3 in the first iteration in which
	 * we have higher probability of getting prime number
	 */
	private static boolean checkForPrime(int num1) {

		if (num1 == 1) {
			return false;
		}
		if (num1 == 2 || num1 == 3) {
			return true;
		}
		if (num1 % 2 == 0 || num1 % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num1; i = i + 6) {

			if ((num1) % i == 0 || (num1) % (i + 2) == 0) {
				return false;

			}
		}
		return true;
	}

}
