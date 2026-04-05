package oriented;

public class MethodOverRiddingMain {

	public static void main(String[] args) {
		MethodOverRidding outer = new MethodOverRidding();
		MethodOverRidding.MethodOverRiddings inner = outer.new MethodOverRiddings();
		System.out.println(inner.sum("Hello", "Java"));
		System.out.println(outer.sum(19, 20));

	}

}
