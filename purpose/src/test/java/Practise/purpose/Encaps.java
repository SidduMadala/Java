package Practise.purpose;

public class Encaps {
	private String name;
	private int age;
	private String hno;
	public Encaps(String name, int age, String hno) {
		super();
		this.name = name;
		this.age = age;
		this.hno = hno;
	}
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
	@Override
	public String toString() {
		return "Encaps [name=" + name + ", age=" + age + ", hno=" + hno + "]";
	}
	
}
