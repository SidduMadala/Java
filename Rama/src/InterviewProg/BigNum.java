package InterviewProg;

import java.util.Scanner;

public class BigNum {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		System.out.println("Enter the a value : ");
		int a = si.nextInt();
		System.out.println("Enter the b value : ");
		int b = si.nextInt();
		System.out.println("Enter the c value : ");
		int c = si.nextInt();

		if (a >= b && a >= c) {
			System.out.println("A is the biggest number: " + a);
		} else if (b >= a && b >= c) {
			System.out.println("B is the biggest number: " + b);
		} else {
			System.out.println("C is the biggest number: " + c);
		}
		si.close();
	}

}
