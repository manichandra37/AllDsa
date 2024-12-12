package checkForPrime;

import java.util.Scanner;

public class CheckingForPrimeFirstMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();

		System.out.print(checkForPrime(num1));

	}

	private static boolean checkForPrime(int num1) {
		// TODO Auto-generated method stub
		if (num1 == 1) {
			return false;
		} else {
			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0) {
					return false;
				}
			}
		}

		return true;
	}

}
