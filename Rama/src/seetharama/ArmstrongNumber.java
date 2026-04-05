package seetharama;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int sum = 0;
		int rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value_:");
		int n = sc.nextInt();
		// int n = 151;
		int org = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
			System.out.println(sum);
		}
		if (org == sum) {
			System.out.println("It is a Armstrong Number_" + sum);
		} else {
			System.out.println("It is not a Armstrong Number_" + sum);
		}
	}

}
