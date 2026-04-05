package InterviewProg;

import java.util.Scanner;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		int count = 0;
		int Ccount = 0;
		int Vcount = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String sid = s.nextLine();
		for (int i = 0; i < sid.length(); i++) {
			if (sid.charAt(i) != ' ') {
				count++;
			}
			if (sid.charAt(i) == 'a' || sid.charAt(i) == 'e' || sid.charAt(i) == 'i' || sid.charAt(i) == 'o'
					|| sid.charAt(i) == 'u') {
				Vcount++;

			} else if ((sid.charAt(i) >= 'a') && (sid.charAt(i) <= 'z')) {
				Ccount++;
			}
		}
		System.out.println("Total Vowels and consonents are: " + count);
		System.out.println("Total Vowels are: " + Vcount);
		System.out.println("Total consonents are: " + Ccount);
	}
}
