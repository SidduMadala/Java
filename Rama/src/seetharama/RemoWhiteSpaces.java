package seetharama;

import java.util.Scanner;

public class RemoWhiteSpaces {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string_:");
		String ma = s.nextLine();
		int count = 0;
		String str = "";
		str = str + ma.replaceAll("\\s", "");
		System.out.println(ma + " :_After removing all spaces from the wordcount_: \n" + str);
	}
}
