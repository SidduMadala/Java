package seetharama;

public class PrimeOrNot {
	public static void main(String[] args) {
		int count = 0;
		int n = 24;

		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("It is a palindrome");
			} else {
				System.out.println("It is not a palindrome");
			}
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
