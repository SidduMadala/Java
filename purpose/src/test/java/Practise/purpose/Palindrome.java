package Practise.purpose;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String result = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String ma = s.nextLine();
		for (int i = ma.length() - 1; i >= 0; i--) {
			result += ma.charAt(i);
			System.out.println(result);
		}
		if (ma.equals(result)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
