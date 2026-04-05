package Practise.purpose;

public class Revers {

	public static void main(String[] args) {
		String m = "Madala";
		char reversed ;
		for (int i = m.length() - 1; i >= 0; i--) {
			reversed = m.charAt(i);
			System.out.println(reversed);
		}
	}
}
