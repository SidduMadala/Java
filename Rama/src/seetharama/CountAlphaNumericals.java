package seetharama;

public class CountAlphaNumericals {

	public static void main(String[] args) {
		String s = "M1a2d3a4l5a6";
		int sum = 0;
		char[] m = s.toCharArray();
		for (char ma : m) {
			if (Character.isDigit(ma))
				sum += Integer.parseInt(String.valueOf(ma));
			System.out.println("String value count_" + sum);
		}
	}

}
