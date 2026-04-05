package InterviewProg;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String ma = s.nextLine();
		String reverse = "";
		for (int i = ma.length() - 1; i >= 0; i--) {
			reverse = reverse + ma.charAt(i);
		}
		System.out.println("Reverse string: " + reverse);
		if (reverse.equalsIgnoreCase(ma)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
