package InterviewProg;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		int count = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String sid = s.nextLine();
		for (int i = sid.length() - 1; i > 0; i--) {
			if ((sid.charAt(i) == ' ') && (sid.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
