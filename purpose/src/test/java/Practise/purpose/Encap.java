package Practise.purpose;

public class Encap {
	private String name;
	private int age;
	private String hno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public void disp() {
		System.out.println(name + "______" + age + "_______" + hno);
	}
}
