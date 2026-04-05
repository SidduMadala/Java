package oriented;

public class Madalas {

	public void tiger() {
		System.out.println("Everybody has to fear");
	}
}

class Siddhu extends Madalas {

	@Override
	public void tiger() {
		System.out.println("I am the head of the forest");
	}
}
