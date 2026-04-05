package Practise.purpose;

import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please entr the number:");
		int sid = s.nextInt();
		for (int i = 1; i <= sid; i++) {
			if (i % 2 != 0) {
				System.out.println("It's a Odd number:__" + i);
			} else {
				System.out.println("It's a Even number:__" + i);
			}
		}
	}
}
