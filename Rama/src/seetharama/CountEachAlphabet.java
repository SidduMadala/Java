package seetharama;

import java.util.Scanner;

public class CountEachAlphabet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int arr[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char m = str.charAt(i);
			int ma = (int) m;
			arr[ma]++;
		}
		System.out.println("Character sequencies:");
		for (int i = 0; i < 256; i++) {
			if (arr[i] != 0) {
				System.out.println((char) i + ":" + arr[i]);
			}
		}
	}

}
