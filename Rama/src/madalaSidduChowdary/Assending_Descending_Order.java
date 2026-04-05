package madalaSidduChowdary;

import java.util.ArrayList;
import java.util.Collections;

public class Assending_Descending_Order {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(50);
		l1.add(70);
		l1.add(60);
		l1.add(30);
		l1.add(80);
		l1.add(20);
		l1.add(40);
		l1.add(10);
		System.out.println("Before Arragnge the order: " + l1);
		Collections.sort(l1);
		System.out.println("Assending order: " + l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Desending order: " + l1);
	}

}
