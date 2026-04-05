package Practise.purpose;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Madala {
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Siddu", 5);
		m.put("Sridhar", 4);
		m.put("Nagateja", 7);
		m.put("Mahesh", 2);
		m.put("Karthik", 3);
		m.put("Narasimha", 6);
		System.out.println(m);
		Set<String> ma = m.keySet();
		System.out.println(ma);
		Collection<Integer> si = m.values();
		System.out.println(si);
		m.put("Srilakshmi", 5);
		System.out.println(m);
		Set<Entry<String, Integer>> sidhu = m.entrySet();
		System.out.println(sidhu);
		Iterator<Entry<String, Integer>> itr = sidhu.iterator();
		while (itr.hasNext()) {
			Map.Entry ms = (Map.Entry) itr.next();
			if (ms.getKey().equals("Siddu")) {
				ms.setValue(1);
			}
			System.out.println(ms);
			if (ms.getValue().equals(6)) {
				itr.remove();
			}
			System.out.println(ms);
		}
		System.out.println("Final Map: " + m);
	}
}
