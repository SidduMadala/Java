package seetharama;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		for (int i = 1; i < 8; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a number is_ " + fact);
	}

}
