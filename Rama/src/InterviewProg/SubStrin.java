package InterviewProg;

import java.util.Scanner;

public class SubStrin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String first = s.nextLine();
		System.out.println("Enter the second string: ");
		String second = s.nextLine();
		if (first.contains(second)) {
			System.out.println("It is available");
		} else {
			System.out.println("It is not available");
		}

	}

}
