package madalaSidduChowdary;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
	public static void main(String[] args) {

		String s = "automation";
		Map<Character, Integer> map = new LinkedHashMap<>();

		
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		
		int count = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println("First unique character: " + entry.getKey());
				count++;
				if (count == 2) {
					System.out.println("Second unique character: " + entry.getKey());
					break;
				}
			}
		}
	}
}
