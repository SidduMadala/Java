package Practise.purpose;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String m = "siddu";
		String s = "uddis";
		char[] si = m.toCharArray();
		char[] sid = s.toCharArray();
		Arrays.sort(si);
		Arrays.sort(sid);
		if (Arrays.equals(si, sid))
			
		{
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is not Anagram");
		}
	
	}

}
