package oriented;

public class MetoveloadMain {

	public static void main(String[] args) {
		Metoveload m = new Metoveload();
		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(30f, 80f));
		System.out.println(m.sum(34l, 70l));
		System.out.println(m.sum("Siddu", "Madala", "Sahithi"));
	}
}
