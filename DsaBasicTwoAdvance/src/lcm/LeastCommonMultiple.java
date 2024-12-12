package lcm;

import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");

		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();

		System.out.print("Number of digits : " + lcm(num1, num2));
	}

	/*
	 * Here in this method we are finding the LCM of a,b . As we know Lcm of a (a,b)
	 * number can be b or greater than b. so, below solution starts from maximum of
	 * two numbers and the loop stops on when the number is divisible by a,b.
	 */
	private static int lcm(int num1, int num2) {

		int res = Math.max(num1, num2);

		while (true) {

			if (res % num1 == 0 && res % num2 == 0) {

				return res;

			}
			res++;
		}
		// return 0;
	}

}
