package oriented;

public abstract class AbsCode {
	public abstract void siddu();

	public abstract void madala();

	public abstract void sridhar();
}

abstract class siddum extends AbsCode {
	public void siddu() {
		System.out.println("This is from siddu");
	}

	public void madala() {
		System.out.println("I am from madala ");
	}

	public abstract void sridhar();
}

class madalas extends siddum {

	@Override
	public void sridhar() {
		System.out.println("This is from sridhar class");

	}

}
