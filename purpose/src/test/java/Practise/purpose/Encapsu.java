package Practise.purpose;

public final class Encapsu {
	private String name = "Madala Siddu";
	private int age = 27;
	private String hno = "1-3B, Bedsupalle(V), Posupalle(P), Komarolu(M), Praksham(D)";

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	public String getHno() {
		return hno;

	}

	@Override
	public String toString() {
		return "Encapsu [name=" + name + ", age=" + age + ", hno=" + hno + "]";
	}

}
