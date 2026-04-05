package InterviewProg;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int palin = s.nextInt();
		int n = palin;
		int sum = 0;
		int rev = 0;
		while (n > 0) {
			rev = n % 10;
			sum = sum + (rev * rev * rev);
			n = n / 10;
			System.out.println(sum);
		}
		if (sum == palin) {
			System.out.println("It is a Armstrong Number");
		} else {
			System.out.println("It is not a Armstrong Number");
		}
	}

}
