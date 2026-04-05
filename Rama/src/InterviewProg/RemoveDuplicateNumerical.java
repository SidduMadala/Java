package InterviewProg;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateNumerical {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Numerical:");
		String ms = s.nextLine();
		Set<Character> ma = new TreeSet<Character>();
		for (int i = 0; i < ms.length(); i++) {
			ma.add(ms.charAt(i));
			System.out.println("Total Charcters are:" + ma);
		}
		StringBuffer sb = new StringBuffer();
		for (Character si : ma) {
			sb.append(si);
			System.out.println(sb);
		}
	}

}
