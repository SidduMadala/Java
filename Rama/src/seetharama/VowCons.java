package seetharama;

import java.util.Scanner;

public class VowCons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str = sc.nextLine();

		int Ccount = 0;
		int Vcount = 0;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != -1) {
				count++;
			}
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {
				Vcount++;
			} else if ((str.charAt(i) > 'A') && (str.charAt(i) < 'Z')) {
				Ccount++;
			}

		}
		System.out.println("The total vowels and consonants are: " + count);
		System.out.println("The total vowels are: " + Vcount);
		System.out.println("The total consonants are: " + Ccount);

	}

}
