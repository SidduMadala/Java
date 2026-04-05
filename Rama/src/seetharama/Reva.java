package seetharama;

public class Reva {

	public static void main(String[] args) {
		String m = "madala";
		String reverse = "";
		for (int i = m.length() - 1; i >= 0; i--) {
			reverse = reverse + m.charAt(i);
		}

		System.out.println("After reversing the string is: " + reverse);
	}
}
