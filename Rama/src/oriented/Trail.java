package oriented;

import java.util.HashSet;

public class Trail {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("A");
		System.out.println(hs.size());

	}

}
