package InterviewProg;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Alphabetical:");
		String ms = s.nextLine();
		Set<Character> m = new TreeSet<Character>();
		for (int i = 0; i < ms.length(); i++) {
			m.add(ms.charAt(i));
		}
		System.out.println("Total characters are_" + m);
		StringBuffer sb = new StringBuffer();
		for (Character si : m) {
			sb.append(si);
			System.out.println("Duplicate characters are_" + sb);
		}

	}

}
