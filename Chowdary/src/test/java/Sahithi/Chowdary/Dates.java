package Sahithi.Chowdary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dates {

	WebDriver m;
	String ma = "March";

	@Test
	public void datepicker() throws Exception {

		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(m, Duration.ofSeconds(20));
		m.get("https://www.abhibus.com/");

		WebElement from = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Leaving From']")));
		from.sendKeys("Bangalore");
		from.sendKeys(Keys.ENTER);

		WebElement to = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Going To']")));
		to.sendKeys("Komarolu");
		to.sendKeys(Keys.ENTER);

		WebElement dateInput = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Onward Journey Date']")));
		dateInput.click();

		while (true) {

			//WebElement si = m.findElement(By.xpath("//*[@id=\"jaurney-date\"]/div/div[2]/div[1]"));
			WebElement si = m.findElement(By.xpath("//div[@class=' col']//span[@style=\'padding: 0.5rem;\']"));
			String currentMonth = si.getText().toString();
			System.out.println("Current Month is:" + currentMonth);

			if (currentMonth.equalsIgnoreCase(ma)) {

				break;
			}

			WebElement nextbutton = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@id=\"jaurney-date\"]/div/div[2]/div[1]/div[3]")));
			nextbutton.click();
		}

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='15']"))).click();

		//m.quit();
	}
}
