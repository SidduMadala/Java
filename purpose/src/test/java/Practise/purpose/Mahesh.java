package Practise.purpose;

import java.util.Comparator;
import java.util.TreeSet;

public class Mahesh {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<>(new MyComparator());

		t.add(10);
		t.add(40);
		t.add(43);
		t.add(78);
		t.add(34);
		t.add(39);

		System.out.println(t);
	}

	static class MyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer i1, Integer i2) {

			if (i1 < i2) {
				return +1;
			} else if (i1 > i2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}