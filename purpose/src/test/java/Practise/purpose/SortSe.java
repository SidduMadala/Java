package Practise.purpose;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortSe {

	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(20);
		s.add(100);
		s.add(300);
		s.add(250);
		s.add(96);
		s.add(343);
		s.add(65);
		System.out.println("Numbers are :" + s);
		System.out.println("First Number is :" + s.first());
		System.out.println("Last Number is :" + s.last());
		System.out.println("subset Number is :" + s.subSet(20, 300));
		System.out.println("headset Number is :" + s.headSet(100));
		System.out.println("tailset Number is :" + s.tailSet(300));

	}

}
