package oriented;

import java.util.Stack;

public class StacCode {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("M"));
		System.out.println(s.isEmpty());
		System.out.println(s.search("B"));
		System.out.println(s.push("siddu"));
		System.out.println(s);
	}

}
