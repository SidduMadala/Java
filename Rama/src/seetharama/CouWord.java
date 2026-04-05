package seetharama;

import java.util.Scanner;

public class CouWord {
	public static void main(String[] args) {
		int count = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value_:");
		String ma = s.nextLine();
		for (int i = 0; i <= ma.length() - 1; i++) {
			if ((ma.charAt(i) == ' ') && (ma.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
