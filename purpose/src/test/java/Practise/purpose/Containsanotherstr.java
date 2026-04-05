package Practise.purpose;

import java.util.Scanner;

public class Containsanotherstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String m = sc.next();
		Scanner sa = new Scanner(System.in);
		System.out.println("Please enter string another string");
		String s = sa.next();
		System.out.println(40 + "A");
		if (m.contains(s)) {
			System.out.println("It is available");
		} else {
			System.out.println("It is not available");
		}
	}

}
