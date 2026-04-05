package oriented;

public interface InterCode {


	public void sridhar();

	public void mahesh();
}

class sahithi implements InterCode {

	

	@Override
	public void sridhar() {
		System.out.println("This is Sridhar");

	}

	@Override
	public void mahesh() {
		System.out.println("This is Mahesh");

	}

}