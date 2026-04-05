package madalaSidduChowdary;

import java.util.ArrayList;
import java.util.Collections;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";

		ArrayList<Character> ma = new ArrayList<Character>();
		for (char mad : s.toCharArray()) {
			ma.add(mad);
			System.out.println(ma);
		}
		ArrayList<Character> ch = new ArrayList<Character>(ma);
		Collections.reverse(ch);
		System.out.println(ch);

		if (ma.equals(ch)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
