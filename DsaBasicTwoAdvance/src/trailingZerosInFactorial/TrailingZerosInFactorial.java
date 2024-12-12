package trailingZerosInFactorial;

import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the factorial number");

		int number = scan.nextInt();

		int n = zerosInFactorial(number);

		System.out.println("No of zeros are : " + n);

	}

	private static int zerosInFactorial(int number) {

		int ans = 0;

		for (int i = 5; number/i > 1; i = i * 5) {

			ans += number / i;

		}
		// TODO Auto-generated method stub
		return ans;
	}

}
