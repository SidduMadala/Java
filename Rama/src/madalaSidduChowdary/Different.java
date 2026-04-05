package madalaSidduChowdary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Different {
	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("A", "B", "C");
		List<String> l2 = Arrays.asList("B", "C");

		List<String> diff = new ArrayList<>(l1);
		diff.removeAll(l2);

		System.out.println(diff);
	}
}
