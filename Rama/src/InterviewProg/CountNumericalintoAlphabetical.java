package InterviewProg;

import java.util.Scanner;

public class CountNumericalintoAlphabetical {

	public static void main(String[] args) {
		String sum = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the AlphaNumerical value");
		String ma = s.nextLine();
		char[] sid = ma.toCharArray();
		for (char ms : sid) {
			if (Character.isAlphabetic(ms)) {
				sum = sum + ms;
				//System.out.println(sum);
			}
		}
		System.out.println(sum);
	}

}
