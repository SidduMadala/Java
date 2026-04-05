package Sahithi.Chowdary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Liste.class)
public class Contacts extends Embededwebserviceslogpage {
	WebDriverWait wait = new WebDriverWait(m, Duration.ofSeconds(10));

	@Test(retryAnalyzer = Sahithi.Chowdary.Analyser.class)
	public void contacts() throws InterruptedException {

		Thread.sleep(1000);
		m.findElement(By.xpath("//a[@id='SendPages']")).click();
		m.findElement(By.xpath("//a[@id='AddressBook']")).click();
		int count = 1;
		for (int s = 1; s <= 20; s++) {

			m.findElement(By.xpath("//input[@id='DeviceContactAddContactButton']")).click();
			Thread.sleep(1000);

			// String uniquecontactName = "Contact_" +
			// UUID.randomUUID().toString().substring(0, 10) + count++;
			// System.out.println("Generated unique contact name: " + uniquecontactName);
			// m.findElement(By.xpath("//input[@id='DisplayName']")).sendKeys(uniquecontactName);
			// m.findElement(By.xpath("//input[@id='DisplayName']")).sendKeys("user" +
			// count);

			// char displayChar = (char) (s + 65);

			WebElement disp = m.findElement(By.xpath("//input[@id='DisplayName']"));
			disp.sendKeys("User " + count);
			// disp.sendKeys(String.valueOf(displayChar));
			Thread.sleep(1000);
			m.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Packard");
			m.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Hewlett");
			m.findElement(By.xpath("//input[@id='Email']")).sendKeys("mailadmin@ipv6.com");
			m.findElement(By.xpath("//input[@id='FaxNumber']")).sendKeys("724100");
			Thread.sleep(1000);
			WebElement network = m.findElement(By.xpath("//select[@id='NetworkFolder']"));
			Select si = new Select(network);
			si.selectByValue("SharedFolder");
			Thread.sleep(1000);
			m.findElement(By.xpath("//input[@id='UNCFolderPath']")).sendKeys("\\\\10.11.12.100\\Builds\\siddardha");
			m.findElement(By.xpath("//input[@id='UNCUsername']")).sendKeys("admin");
			m.findElement(By.xpath("//input[@id='UNCPassword']")).sendKeys("rdl@123");

			m.findElement(By.xpath("//input[@id='FormButtonSubmit']")).click();
			int Addressbook = count++;
			System.out.println("The " + Addressbook + " contact is created");
			Thread.sleep(1000);
		}
	}
}
