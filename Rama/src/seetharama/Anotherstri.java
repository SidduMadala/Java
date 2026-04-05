package seetharama;

import java.util.Scanner;

public class Anotherstri {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the the strng1_");
		String m = s.nextLine();

		Scanner si = new Scanner(System.in);
		System.out.println("please enter the the strng2_");
		String ma = si.nextLine();

		if (m.contains(ma)) {
			System.out.println("It is available");
		} else {
			System.out.println("It is not available");
		}
	}

}
