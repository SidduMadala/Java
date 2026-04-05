package InterviewProg;

import java.util.Scanner;

public class CountAlphabiticalNumericals {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String sid = s.nextLine();
		char[] m = sid.toCharArray();
		for (char ma : m) {
			if (Character.isDigit(ma)) {
				// sum = sum + Integer.parseInt(String.valueOf(sid));
				sum = sum + Character.getNumericValue(ma);

			}
			System.out.println(sum);
		}

	}

}
