package InterviewProg;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://en.wikipedia.org/wiki/Rama");
		List<WebElement> link = m.findElements(By.tagName("a"));
		int btotal = 0;
		int ototal = 0;
		for (WebElement links : link) {
			@Nullable
			String url = links.getAttribute("href");

			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			int len = url.length();
			System.out.println("URL: " + url);
			System.out.println("Length: " + len);

			try {

				URL linkurl = new URL(url);
				HttpsURLConnection huc = (HttpsURLConnection) linkurl.openConnection();

				// huc.setRequestMethod("HEAD");
				huc.connect();

				int responseCode = huc.getResponseCode();

				if (responseCode >= 400) {
					System.out.println(url + " ---> Broken Link_" + btotal++);
				} else {
					System.out.println(url + " ---> Valid Link_" + ototal++);
				}

			} catch (Exception e) {
				System.out.println(url + " ---> Error occurred");
			}

		}

	}

}
