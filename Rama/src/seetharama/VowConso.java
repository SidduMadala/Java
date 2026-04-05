package seetharama;

import java.util.Scanner;

public class VowConso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str = sc.nextLine();

		int Vcount = 0;
		int Ccount = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u') {

					Vcount++;
				} else {
					Ccount++;
				}
			}
		}
		System.out.println("The total vowels and consonents are: " + count);
		System.out.println("The total vowels are: " + Vcount);
		System.out.println("The total consonants are: " + Ccount);
	}
}
