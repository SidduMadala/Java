package Practise.purpose;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HaMas {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "siddu");
		h.put(2, "sridhar");
		h.put(3, "Mahesh");
		h.put(5, "Nagateja");
		h.put(4, "Karthik");
		System.out.println(h);
		System.out.println(h.put(2, "Madala Siddu"));
		System.out.println(h);
		Set<Integer> si = h.keySet();
		System.out.println(si);
		Collection<String> ma = h.values();
		System.out.println(ma);
		Set<Entry<Integer, String>> masi = h.entrySet();
		System.out.println(masi);
		Iterator<Entry<Integer, String>> itr = masi.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "......" + m1.getValue());
			if (m1.getKey().equals(2)) {
				m1.setValue("Sridhar");
			}
			System.out.println(m1);
		}
	}

}
