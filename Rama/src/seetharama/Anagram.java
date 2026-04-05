package seetharama;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String first = sc.nextLine();
		System.out.println("Please enter the string");
		String second = sc.nextLine();
		if (first.length() != second.length()) {
			System.out.println("Length is mismatched");
		} else {
			char[] c1 = first.toCharArray();
			char[] c2 = second.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("It is a Armstrong Number");
			} else {
				System.out.println("It is not a Armstrong Number");
			}
		}

	}

}
