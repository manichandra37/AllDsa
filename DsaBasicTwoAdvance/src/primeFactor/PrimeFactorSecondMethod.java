package primeFactor;

import java.util.Scanner;

public class PrimeFactorSecondMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();

		checkForPrime(num1);

	}

	private static void checkForPrime(int num1) {

		if (num1 == 1) {
			System.out.println("1 Doesn't have any prime factors");
		}
		while (num1 % 2 == 0) {
			System.out.println("2");
			num1 = num1 / 2;
		}
		while (num1 % 3 == 0) {
			System.out.println("3");
			num1 = num1 / 3;
		}
		for (int i = 5; i * i <= num1; i = i + 6) {

			while (num1 % i == 0) {
				System.out.println(i);
				num1 = num1 / i;
			}
			while (num1 % (i + 2) == 0) {
				System.out.println(i);
				num1 = num1 / i;
			}

		}
		if (num1 > 3) {
			System.out.println(num1);
		}

	}

}
