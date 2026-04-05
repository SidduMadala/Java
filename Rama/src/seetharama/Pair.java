package seetharama;

public class Pair {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 11, 13 };
		boolean found = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == 20) {
					System.out.println("Pair found: " + a[i] + " + " + a[j] + " = 20");
					found = true;
				}
			}

		}
		if (!found) {
			System.out.println("Pair is not available");

		}

	}

}
