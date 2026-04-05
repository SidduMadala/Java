package madalaSidduChowdary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Built_In_Methods {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(15);
		a.add(0);
		a.add(5);
		a.add(20);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		System.out.println(Collections.binarySearch(a, 5, new MyComparator()));
	}

	 static class MyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
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
