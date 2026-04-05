package Practise.purpose;

import java.util.Scanner;

public class Reverseastr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = sc.nextLine();
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);

		}
		System.out.println("The given string reverse is :" + result);
	}
}
