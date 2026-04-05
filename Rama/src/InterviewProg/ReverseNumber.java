package InterviewProg;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev = 0;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int ma = s.nextInt();
		while (ma != 0) {
			rev = ma % 10;
			sum = sum * 10 + rev;   //sum = sum * 10 + rev;
			ma = ma / 10;
		}
		System.out.println(sum);
	}

}
