package Practise.purpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HpSmart {
	WebDriver m;
	String name = "siddu";

	@Test
	public void Smart() throws Exception {
		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://admin.hpsmart.com/connect");
		Thread.sleep(3000);
		m.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		// m.findElement(By.linkText("additional cloud features")).click();

		WebElement create = m.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
		WebElement exit = m.findElement(By.xpath("//span[contains(text(),'Sign in with an existing account')]"));

		if (name.equals("siddu")) {
			Thread.sleep(3000);
			create.click();
			System.out.println("Now Account is going to create");

		} else if (name.equals("chandu")) {
			Thread.sleep(3000);
			exit.click();

		}
		

	}
}
