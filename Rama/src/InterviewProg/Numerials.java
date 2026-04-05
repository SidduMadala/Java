package InterviewProg;

import java.util.Scanner;

public class Numerials {

	public static void main(String[] args) {
		String sum = "";
		int sum1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the AlphaNumerical value");
		String ma = s.nextLine();
		char[] sid = ma.toCharArray();
		for (char ms : sid) {
			if (Character.isDigit(ms)) {
				sum = sum + ms;
				sum1 = sum1 + Character.getNumericValue(ms);
			}

		}
		System.out.println(sum);
		System.out.println(sum1);
	}

}
