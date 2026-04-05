package InterviewProg;

public class CharacCount {
	public static void main(String[] args) {
		String s = "madalasidduchowdary";
		int[] m = new int[256];
		for (int i = 0; i <= s.length() - 1; i++) {
			m[s.charAt(i)]++;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i] > 0) {
				System.out.println((char) i + "-->" + m[i]);
			}
		}
	}
}
