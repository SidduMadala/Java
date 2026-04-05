package files;

public class Siddu {

	public static void main(String[] args) {
		int[] m = new int[256];
		String s = "VaSAVi";
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			m[s.charAt(i)]++;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i] > 0) {

				System.out.println("Character count are:  " + (char) i + "--->" + m[i]);
			}
		}

	}

}
