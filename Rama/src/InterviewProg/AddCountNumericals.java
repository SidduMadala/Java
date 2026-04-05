package InterviewProg;

import java.util.Scanner;

public class AddCountNumericals {

	public static void main(String[] args) {
		int sum = 0;
		int rev = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int su = s.nextInt();
		int n = su;
		while (n > 0) {
			rev = n % 10;
			sum = sum + rev;
			n = n / 10;
			System.out.println(sum);
		}
	}

}
