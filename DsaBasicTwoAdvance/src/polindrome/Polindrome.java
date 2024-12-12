package polindrome;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {

		Scanner myObject = new Scanner(System.in);

		System.out.print("Enter your number");

		int polindrome = myObject.nextInt();

		boolean res = chcekForPoli(polindrome);

		System.out.print(res);
	}

	private static boolean chcekForPoli(int polindrome) {

		int temp = polindrome;
		int res = 0;
		while (temp != 0) {

			int id = temp % 10;
			res = res * 10 + id;
			temp = temp / 10;
		}
		return (res == polindrome);

	}

}
