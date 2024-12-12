package checkForPrime;

import java.util.Scanner;

public class CheckingForPrimeSecondMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();

		System.out.print(checkForPrime(num1));

	}

	/*
	 * This is the second method used to check weather the given number is prime or not
	 * with time complexity O(root n) . Here we are iterating the loop for root n time's. For 
	 * Example , for 36 loop runs for 6 times .
	 */
	private static boolean checkForPrime(int num1) {

		if (num1 == 1) {
			return false;
		} else {
			for (int i = 2; (i * i) <=num1; i++) {

				if (num1 % i == 0) {
					return false;
				}
			}
		}

		return true;
	}

}
