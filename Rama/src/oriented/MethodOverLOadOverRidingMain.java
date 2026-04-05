package oriented;

public class MethodOverLOadOverRidingMain {

	public static void main(String[] args) {
		MethodOverLOadOverRiding m = new MethodOverLOadOverRiding();
		System.out.println(m.siddu(10, 20));
		System.out.println(m.siddu("Madala", "Siddu", "Sumanth"));
		payment p = new payment();
		System.out.println(p.siddu(10, 80));
		System.out.println(p.siddu("Madala", "Siddu", "Sumanth"));

	}

}
