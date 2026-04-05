package seetharama;

public class Primenumber1to100 {

	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			int count = 0;
			if (n > 1) {
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(n);
				}
			}
		}

	}

}
