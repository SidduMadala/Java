package InterviewProg;

public class Revstri {

	public static void main(String[] args) {
		String ma = "madalasiddu";
		String reverse = "";
		for (int i = ma.length() - 1; i >= 0; i--) {
			reverse = reverse + ma.charAt(i);

		}
		System.out.println(reverse);
	}

}
