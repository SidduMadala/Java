package seetharama;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int sum = 0;
		for (int m = 0; m < 5; m++) {
			sum = i + j;
			System.out.println(" " + sum);
			i = j;
			j = sum;
		}

	}

}
