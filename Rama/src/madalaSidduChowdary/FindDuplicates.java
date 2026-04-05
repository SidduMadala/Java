package madalaSidduChowdary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		ArrayList<String> sid = new ArrayList<String>();
		sid.add("Madala");
		sid.add("Rama");
		sid.add("Siddu");
		sid.add("Rama");
		sid.add("Sridhar");
		sid.add("Seetha");
		sid.add("Mahesh");
		sid.add("Rama");
		sid.add("Guru");
		sid.add("Seetha");
		sid.add("Sahithi");
		Set<String> unique = new HashSet<String>();
		Set<String> duplicate = new HashSet<String>();
		for (String m : sid) {
			if (!unique.add(m)) {
				duplicate.add(m);

			}
		}
		System.out.println("Unique values are: " + unique);
		System.out.println("Duplicate values are: " + duplicate);
		ArrayList<String> sortedDuplicates = new ArrayList<>(duplicate);
		Collections.sort(sortedDuplicates);

		System.out.println("Sorted Duplicate values are: " + sortedDuplicates);
	}

}
