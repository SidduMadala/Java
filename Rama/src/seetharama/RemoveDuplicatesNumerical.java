package seetharama;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesNumerical {

	public static void main(String[] args) {
		String h = "123423";
		Set<Character> m = new TreeSet<Character>();
		for (int i = 0; i < h.length(); i++) {
			m.add(h.charAt(i));
		}
		System.out.println(m);
		StringBuffer sb = new StringBuffer();
		for (Character ha : m) {
			sb.append(ha);
		}
		System.out.println("Removing the duplicate numbers_" + sb);
	}

}
