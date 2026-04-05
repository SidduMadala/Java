package oriented;

public interface InterfCode {
	public void siddu();

	public void sridhar();

	public void mahesh();
}

interface madala {
	public void nagateja();

	public void saiprasad();

}

class masi implements madala, InterfCode {

	@Override
	public void siddu() {
		System.out.println("This is Siddu");

	}

	@Override
	public void sridhar() {
		System.out.println("This is Sridhar");

	}

	@Override
	public void mahesh() {
		System.out.println("This is Mahesh");

	}

	@Override
	public void nagateja() {
		System.out.println("This is Nagateja");

	}

	@Override
	public void saiprasad() {
		System.out.println("This is Saiprasad");

	}

}