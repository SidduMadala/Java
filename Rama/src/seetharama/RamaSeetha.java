package seetharama;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RamaSeetha {

	public static void main(String[] args) {
		System.out.println("Jai Sreeram");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		m.get("https://en.wikipedia.org/wiki/Rama");
	}

}
