package InterviewProg;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the frist value:");
		String si = sc.nextLine();

		Scanner sd = new Scanner(System.in);
		System.out.println("Please enter the Second value:");
		String sm = sc.nextLine();

		if (si.length() != sm.length()) {
			System.out.println("Length is mis-matched");
		} else {
			char[] c1 = si.toCharArray();
			char[] c2 = sm.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("It is a Anagram");
			} else {
				System.out.println("It is not a Anagram");
			}
		}
	}
}
