package Practise.purpose;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandleWind {
	WebDriver m;

	@Test
	public void wind() throws InterruptedException {
		ChromeOptions cp = new ChromeOptions();
		cp.setAcceptInsecureCerts(true);
		m = new ChromeDriver(cp);
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://www.flipkart.com/");
		WebElement search = m.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("One plus 15s");
		search.submit();
		m.findElement(By.xpath("//div[contains(text(),'OnePlus 13s 5G (Pink Satin, 256 GB')]")).click();

		Set<String> win = m.getWindowHandles();
		Iterator<String> itr = win.iterator();
		while (itr.hasNext()) {

			String newi = itr.next();
			String child = itr.next();
			m.switchTo().window(child);
			Thread.sleep(2000);
			WebElement highlets = m.findElement(By.xpath("(//div[contains(text(),'₹54,954')])[1]"));

			String details = highlets.getText();
			System.out.println("Heighlets details: " + details);

		}
		m.quit();
	}

}
