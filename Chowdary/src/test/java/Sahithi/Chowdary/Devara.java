package Sahithi.Chowdary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Devara {
	WebDriver m;
	int count = 1;

	@Test
	public void naasongs() {
		System.out.println("Now, I am entering into naa songs webpage");
		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://naasongs.com.co/devara-2024-songs-a.html");
		// m.get("https://naasongs.com.co/andhra-king-taluka-2025-songs-b.html");

		try {
			WebElement text = m.findElement(By.xpath("(//a[contains(text(),'NaaSongs.Com.Co')])[1]"));
			String tex = text.getText();
			System.out.println("Welcome to " + tex);
		} catch (Exception e) {
			System.out.println("NaaSongs.Com.Co content is not there");
		}

		WebElement name = m.findElement(By.xpath("//h1[@itemprop='headline' or @class='entry-title']"));
		String moviename = name.getText();
		System.err.println("Now I am going to download " + moviename);

		List<WebElement> download = m.findElements(
				By.xpath("//a[contains(text(), 'Download')][preceding-sibling::text()[contains(., '320 Kbps')]]"));

		for (WebElement links : download) {
			System.out.println("Songs " + count++ + "  is downloaded\n");
			links.click();

			String fulltext = m.findElement(By.xpath("//p[br]")).getText();

			String[] parts = fulltext.split("–");

			if (parts.length < 2) {
				System.out.println("Invalid format: " + fulltext);
			} else {
				String songName = parts[0].trim();
				String artistName = parts[1].trim();

				System.out.println("Song Name: " + songName);
				System.out.println("Artist Name: " + artistName);
			}
		}
		// m.quit();

	}
}
