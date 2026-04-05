package oriented;

public class MethodOverLOadOverRiding {
	public int siddu(int a, int b) {
		return a + b;
	}

	public String siddu(String s, String m, String k) {
		return s + m + k;
	}
}

class payment extends MethodOverLOadOverRiding {
	public int siddu(int a, int b) {
		return a + b ;

	}
}
