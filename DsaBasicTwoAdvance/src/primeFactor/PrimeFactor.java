package primeFactor;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		list = checkForPrime(num1);

		System.out.print(list);

	}

	private static ArrayList<Integer> checkForPrime(int num1) {

		ArrayList<Integer> primeList = new ArrayList<>();

		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0) {
				while (checkForPrimeNum(i)) {
					// System.out.println(i);
					primeList.add(i);
					break;
				}

			}
		}

		// TODO Auto-generated method stub
		return primeList;
	}

	private static boolean checkForPrimeNum(int i) {

		if (i == 1) {
			return false;
		} else {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					return false;
				}
			}
		}

		return true;

	}

}
