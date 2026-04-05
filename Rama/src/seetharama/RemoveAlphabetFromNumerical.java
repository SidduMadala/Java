package seetharama;

import java.util.Scanner;

public class RemoveAlphabetFromNumerical {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the AlphaNumerical values:");
		String ma = s.nextLine();
		for (int i = 0; i < ma.length(); i++) {
			if (Character.isDigit(ma.charAt(i))) {
			System.out.println(ma.charAt(i));

			 }
		}

	}

}
