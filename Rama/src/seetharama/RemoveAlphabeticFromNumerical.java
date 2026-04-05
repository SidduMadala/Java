package seetharama;

public class RemoveAlphabeticFromNumerical {

	public static void main(String[] args) {
		String s = "ma12da34la56";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
			
		}
	}

}
