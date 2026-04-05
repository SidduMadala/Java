package madalaSidduChowdary;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void main(String[] args) {

		String s = "siddumadala";
		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) +1);
		}

		System.out.println(map);
	}
}
