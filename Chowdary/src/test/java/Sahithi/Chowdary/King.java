package Sahithi.Chowdary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class King {
	WebDriver m;
	String name = "Dude (2025)";

	@Test
	public void Andhra() throws InterruptedException {
		m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://naasongs.com.co/andhra-king-taluka-2025-songs-b.html\n");
		WebElement block = m.findElement(By.xpath("//div[contains(., 'Andhra King Taluka Cast Crew')]\n"));
		String fullText = block.getText();
		System.out.println(fullText);

		String moviename = m.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.println("Movie name is: " + moviename);
		WebElement title = m.findElement(By.xpath("//h2"));
		System.out.println("Title of the movie: " + title);
		WebElement data = m.findElement(By.xpath("//h2"));
		List<WebElement> download = m.findElements(By.xpath("//a[contains(text(),'Download')]\n"));

		for (WebElement down : download) {
			down.click();
		}
		Thread.sleep(7000);
		WebElement dude = m.findElement(By.xpath("//a[contains(text(),'Dude (2025)')]"));
		try {
			if (name.equals("Dude (2025)")) {
				dude.click();
			}
		} catch (Exception e) {
			System.out.println("Dude option is not displaying that's why i am going to close my page");
		}
		List<WebElement> downloads = m.findElements(By.xpath("//a[contains(text(),'Download')]\n"));

		for (WebElement downl : downloads) {
			downl.click();
		}
		WebElement akhanda = m.findElement(By.xpath("//a[contains(text(),'Akhanda 2 (2025)')]"));
		try {
			if (name.equals("Dude (2025)")) {
				akhanda.click();
			}
		} catch (Exception e) {
			System.out.println("Dude option is not displaying that's why i am going to close my page");
		}
		List<WebElement> downloa = m.findElements(By.xpath("//a[contains(text(),'Download')]\n"));

		for (WebElement downlo : downloa) {
			downlo.click();
		}
	}
}
