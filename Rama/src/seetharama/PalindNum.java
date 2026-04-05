package seetharama;

public class PalindNum {

	public static void main(String[] args) {
		int rev = 0;
		int rem;
		int n = 122;
		int original = n;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
			System.out.println(rev);
		}
		if (original == rev) {
			System.out.println("It is a number palindrome");
		} else {
			System.out.println("It is not a number palindrome");
		}
	}

}
