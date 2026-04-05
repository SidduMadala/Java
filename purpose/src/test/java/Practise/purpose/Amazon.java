package Practise.purpose;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver m;

	@Test
	public void handwin() throws InterruptedException {
		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://www.amazon.in/");
		WebElement search = m.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("One plus 15S");
		search.submit();
		m.findElement(By.xpath(
				"(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[1]"))
				.click();
		Set<String> wind = m.getWindowHandles();
		Iterator<String> itr = wind.iterator();
		while (itr.hasNext()) {
			String parent = itr.next();
			String child = itr.next();

			m.switchTo().window(child);
			Thread.sleep(5000);
			String price = m
					.findElement(By.xpath(
							"//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"))
					.getText();
			System.out.println("OnePlus mobile price is: ₹" + price);
			Thread.sleep(3000);
			m.close();
		}
	}

}
