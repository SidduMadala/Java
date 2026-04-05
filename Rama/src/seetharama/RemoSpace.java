package seetharama;

import java.util.Scanner;

public class RemoSpace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string_: ");
		String str = s.nextLine();
		String ma = str.replaceAll("\\s", "");
		System.out.println(ma);

	}

}
