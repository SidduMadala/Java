package Practise.purpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Travel {
	WebDriver m;

	@Test
	public void Busbook() throws InterruptedException {
		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://www.abhibus.com/");
		Thread.sleep(3000);

		try {
			m.switchTo().frame(0);
			m.findElement(By.xpath("//button[@id='closeButton']")).click();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getStackTrace();
		}
		Thread.sleep(2000);
		WebElement from = m.findElement(By.xpath("//input[@placeholder='Leaving From']\r\n"));
		from.click();
		from.sendKeys("Bangalore");
		m.findElement(By.xpath("(//span[@class='highlighted'])[1]")).click();
		Thread.sleep(3000);
		WebElement to = m.findElement(By.xpath("//input[@placeholder='Going To']"));
		to.click();
		Thread.sleep(3000);
		to.sendKeys("Komarolu");
		Thread.sleep(3000);
		to.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		to.sendKeys(Keys.ENTER);

		m.findElement(By.xpath("//span[contains(text(),'Search')]")).click();

	}
}
