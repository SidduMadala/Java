package Practise.purpose;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(m, Duration.ofSeconds(20));
		m.get("https://www.flipkart.com/");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'✕')]"))).click();
		} catch (Exception e) {
			System.out.println("Login popup not displayed");
		}
		WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));

		searchBox.sendKeys("OnePlus 15R");
		searchBox.submit();
		@Nullable
		WebElement phone = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[contains(text(),'OnePlus 15R 5G (Mint Breeze, 256 GB)')]")));
		phone.click();
		Set<String> wind = m.getWindowHandles();
		Iterator<String> itr = wind.iterator();
		while (itr.hasNext()) {
			String parent = itr.next();
			String child = itr.next();
			m.switchTo().window(child);
			@Nullable
			String title = m.getTitle();
			System.out.println(title);
			m.switchTo().window(parent);
		}

	}

}
