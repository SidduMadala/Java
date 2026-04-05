package InterviewProg;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInList {

	public static void main(String[] args) {
		List<Integer> m = new ArrayList<Integer>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		List<Integer> s = new ArrayList<Integer>();
		s.add(10);
		s.add(60);
		s.add(30);
		s.add(40);
		s.add(70);

		List<Integer> ms = new ArrayList<Integer>();
		List<Integer> msi = new ArrayList<Integer>();
		for (Integer si : m) {
			if (s.contains(si)) {
				ms.add(si);
			}
		}
		s.removeAll(ms);
		System.out.println(ms);
		System.out.println(s);
	}

}
