package seetharama;
public class SumTheNumberInAStri {
	public static void main(String[] args) {
		String ms = "Thisis22siddu33madala88rama";
		int sum = 0;
		String num = "";
		for (int i = 0; i < ms.length(); i++) {
			if (Character.isDigit(ms.charAt(i))) {
				num = num + ms.charAt(i);
			} else {
				if (!num.equals("")) {
					sum = sum + Integer.parseInt(num);
					num = "";
				}
			}
		}
		System.out.println(sum);

	}
}
