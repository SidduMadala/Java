package InterviewProg;

public class Non_Repeating {

	public static void main(String[] args) {

		String m = "Madalasiddu";
		for (int i = 0; i < m.length(); i++) {
			char sid = m.charAt(i);
			int count = 0;
			for (int j = 0; j < m.length(); j++) {
				
				if (sid == m.charAt(j)) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println("It is a first non-repeating character:" + sid);
				break;
			}
			else {
				System.out.println("Non repeating characters are not available");
			}
		}
	}
}
