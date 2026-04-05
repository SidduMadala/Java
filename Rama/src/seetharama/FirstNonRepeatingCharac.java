package seetharama;

import java.util.Scanner;

public class FirstNonRepeatingCharac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Alphabetic:");
		String ma = s.nextLine();
		for (int i = 0; i < ma.length(); i++) {
			if (ma.indexOf(ma.charAt(i)) == ma.lastIndexOf(ma.charAt(i))) {
				System.out.println(ma.charAt(i));
				return;
			}
		}
	}

}
