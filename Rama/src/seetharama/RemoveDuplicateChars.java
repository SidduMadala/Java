package seetharama;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s = "coconut";
		Set<Character> ms = new TreeSet<Character>();
		for (int i = 1; i < s.length(); i++) {
			ms.add(s.charAt(i));
		}
		System.out.println("Duplicate characters are_" + ms);

		StringBuffer sb = new StringBuffer();
		for (Character si : ms) {
			sb.append(si);
		}
		System.out.println("Duplicate characters are_" + sb);

	}
}
