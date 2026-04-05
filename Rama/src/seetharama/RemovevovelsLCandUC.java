package seetharama;

public class RemovevovelsLCandUC {

	public static void main(String[] args) {

		String text = "Hi this is siddu madala, I am from bedsupalle!";
		String result = "";
		int vowelCount = 0;

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
/*
			   if ("aeiouAEIOU".indexOf(ch) != -1) {
	                vowelCount++;   // count vowel
	                continue;       // skip adding vowel
	            }
			*/
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++; 
				continue; 
			}

			result += ch; // keep consonants, spaces & punctuation
		}

		System.out.println("Original Text : " + text);
		System.out.println("Lowercase vowels removed : " + result);
		System.out.println("Total lowercase vowels removed : " + vowelCount);
	}
}
