package PagObjMod;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Login {
	WebDriver m;

	@BeforeClass
	public void login() {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		m = new ChromeDriver(options);
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://www.instagram.com/");

	}

	@AfterClass
	public void teardown() {
		m.quit();
	}

	@AfterTest
	public void scree(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE & m != null) {
			File src = ((TakesScreenshot) m).getScreenshotAs(OutputType.FILE);
			String date = new SimpleDateFormat("dd_mm_yyyy_hh_MM_ss").format(new Date());
			String path = "C:\\Users\\Admin\\Desktop\\Rama\\Seetha_" + date + ".png";
			FileUtils.copyFile(src, new File(path));
			System.out.println("Screenshot has been taken by driver and it saved in the path" + path);

		}
	}
}
