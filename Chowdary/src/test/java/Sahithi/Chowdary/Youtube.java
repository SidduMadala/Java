package Sahithi.Chowdary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Youtube {
	WebDriver m;

	@Test
	public void youtube() {
		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://www.youtube.com/");
		String siddu = "Ghibran's Spiritual Series | Govinda Hari Govinda Song Lyric Video | Ghibran";
		WebElement search = m.findElement(By.name("search_query"));
		search.click();
		search.sendKeys("ghibran spiritual songs");
		search.submit();
		List<WebElement> video = m.findElements(By.id("video-title"));
		for (WebElement videos : video) {
			String gibhran = videos.getText();
			System.out.println(gibhran);

			if (gibhran.contains(siddu)) {
				videos.click();
			}
		}
	}
}
