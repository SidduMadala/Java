package seetharama;

public class RemoveNumericalFromAlphabetic {

	public static void main(String[] args) {
		String s = "ma12da34la56";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}

		}

	}

}
