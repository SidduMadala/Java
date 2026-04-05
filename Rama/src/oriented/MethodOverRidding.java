package oriented;

public class MethodOverRidding {

	public int sum(int a, int b) {
		return a + b;
	}

	public class MethodOverRiddings {
		public String sum(String a, String b) {
			return a + b;
		}
	}
}
