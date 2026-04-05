package InterviewProg;

import java.util.Scanner;

class Vconso {
	public static void main(String[] args) {
		int count = 0;
		int Vcount = 0;
		int Ccount = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		String ma = s.nextLine();

		for (int i = 0; i < ma.length(); i++) {
			if (ma.charAt(i) != ' ') {
				count++;
			}
			if (ma.charAt(i) == 'a' || ma.charAt(i) == 'e' || ma.charAt(i) == 'i' || ma.charAt(i) == 'o'
					|| ma.charAt(i) == 'u' || ma.charAt(i) == 'A' || ma.charAt(i) == 'E' || ma.charAt(i) == 'I'
					|| ma.charAt(i) == 'O' || ma.charAt(i) == 'U') {
				Vcount++;
			} else if ((ma.charAt(i) > 'a') && (ma.charAt(i) < 'z') || (ma.charAt(i) > 'A') && (ma.charAt(i) < 'Z')) {
				Ccount++;
			}
		}
		System.out.println("Total vowels and consonets are: " + count);
		System.out.println("Total vowels are: " + Vcount);
		System.out.println("Total consonets are: " + Ccount);
	}
}
