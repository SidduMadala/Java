package Practise.purpose;

import java.util.Comparator;
import java.util.TreeSet;

public class Sidhu {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new siddu());
		t.add("Siddu");
		t.add("Sridhar");
		t.add("Mahesh");
		t.add("Nagateja");
		t.add("Karthik");
		t.add("Narasimha");
		t.add("Srilakshmi");
		System.out.println("Treeset :" + t);
	}

	static class siddu implements Comparator<String> {
		public int compare(String s1, String s2) {
			String si = s1.toString();
			String sd = s2.toString();
			return si.compareTo(sd);

		}

	}
}
