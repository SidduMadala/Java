package Sahithi.Chowdary;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Madala {
	@Test(dataProvider = "siddu")
	public void sahi(String username, String password) {
		System.out.println("Username is:[" + username + "]and password is: [" + password + "]");
	}

	@DataProvider
	public Object[][] siddu() {
		Object[][] masi = { { "sidduchowdary1997@gmail.com", "Madala9999@" } };
		return masi;
	}
}
