package InterviewProg;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String ma = s.nextLine();
		String sisu = ma.replaceAll("\\s", "-");
		System.out.println(sisu);

	}

}
