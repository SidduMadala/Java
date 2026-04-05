package Sahithi.Chowdary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	@Test
	public void box() {
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://omayo.blogspot.com/");
		List<WebElement> boxes = m.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement boxe : boxes) {
			String value = boxe.getAttribute("value");
			System.out.println(value);
			if (value.equalsIgnoreCase("Pen") || value.equalsIgnoreCase("orange") || value.equalsIgnoreCase("blue")) {
				continue;
			} else {
				boxe.click();
			}
		}
	}
}
