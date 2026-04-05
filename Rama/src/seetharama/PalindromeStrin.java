package seetharama;

public class PalindromeStrin {

	public static void main(String[] args) {
		String m = "Madam";
		String s = "";
		for (int i = m.length() - 1; i >= 0; i--) {
			s = s + m.charAt(i);
		}
		System.out.println("After reverse a string is_ " + s);


        if (m.equalsIgnoreCase(s)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

	}

}
