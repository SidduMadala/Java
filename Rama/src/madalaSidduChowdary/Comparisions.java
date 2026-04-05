package madalaSidduChowdary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Comparisions {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		Collections.sort(al);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		//ll.add(90);
		ll.add(80);
		ll.add(70);
		ll.add(60);
		ll.add(50);
		ll.add(40);
		ll.add(30);
		ll.add(20);
		ll.add(10);
		Collections.sort(ll);
		boolean isSame = true;

		for (Integer i : al) {
			if (!ll.contains(i)) {
				isSame = false;
				break;
			}
		}

		System.out.println(isSame);

		// System.out.println(al.equals(ll));

	}

}
