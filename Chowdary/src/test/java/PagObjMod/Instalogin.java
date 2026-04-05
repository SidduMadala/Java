package PagObjMod;

import org.testng.annotations.Test;

public class Instalogin extends Login {

	@Test
	public void logins() throws InterruptedException {

		Details details = new Details(m);

		details.login("9603182636", "Madala9999@");

		Thread.sleep(5000);
	}
}
