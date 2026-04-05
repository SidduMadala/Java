package InterviewProg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();

		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("It is a prime number");
			} else {
				System.out.println("It is not a prime number");
			}
		}
	}
}
