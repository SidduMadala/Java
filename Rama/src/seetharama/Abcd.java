package seetharama;

public class Abcd {

	public static void main(String[] args) {
		String s = "a2b3c4d5";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.println(s.charAt(i));
			} else {
				int x = Character.getNumericValue(s.charAt(i));
				for (int j = 1; j < x; j++) {
					System.out.println(s.charAt(i - 1));
				}		
			}
		}

	}

}
