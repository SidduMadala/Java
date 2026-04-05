package InterviewProg;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:_");
		int ma = s.nextInt();
		int sum = 0;
		int a = 1;
		int b = 0;
		for (int i = 0; i <= ma; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
		System.out.println(b);
	}

}
