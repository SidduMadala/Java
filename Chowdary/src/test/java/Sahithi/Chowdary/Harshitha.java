package Sahithi.Chowdary;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Harshitha {
	@Test(dataProvider = "madala")
	public void mail(String username, String password) {
		System.out.println("UserName is : " + username + "   Password is : " + password);
	}

	@DataProvider
	public Object[] madala() {
		String[][] sid = { { "siddumadala99@gmail.com", "Madala9999@" }, { "siddumadala99@gmail.com", "Madala9999@" },
				{ "siddumadala99@gmail.com", "Madala9999@" }, { "siddumadala99@gmail.com", "Madala9999@" },
				{ "siddumadala99@gmail.com", "Madala9999@" }, { "siddumadala99@gmail.com", "Madala9999@" },
				{ "siddumadala99@gmail.com", "Madala9999@" }, { "siddumadala99@gmail.com", "Madala9999@" },
				{ "siddumadala99@gmail.com", "Madala9999@" }, { "siddumadala99@gmail.com", "Madala9999@" },
				};
		return sid;

	}
}
