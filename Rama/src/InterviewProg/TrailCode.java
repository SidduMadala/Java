package InterviewProg;

import java.util.HashSet;
import java.util.Set;

public class TrailCode {

	public static void main(String[] args) {

		 String s = "3";
		 System.out.println(3 +s+3);
		 System.out.println(3+3+s);
		 System.out.println(s+3+3);
		 final StringBuffer sb = new StringBuffer("java");
		 sb.append("world");
		 System.out.println(sb);

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);

		byte b = 127;
		b++;
		System.out.println(b);

		int x = 5;
		update(x);
		System.out.println(x);

	}

	static void update(int a) {
		a = 10;
	}

}
