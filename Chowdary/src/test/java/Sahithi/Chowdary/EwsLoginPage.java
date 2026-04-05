package Sahithi.Chowdary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class EwsLoginPage {
	WebDriver m;
	SoftAssert s;

	@BeforeTest
	public void login() {
		System.out.println("Now, I am going to automate the Embeded Web Page");
		ChromeOptions cp = new ChromeOptions();
		cp.setAcceptInsecureCerts(true);
		m = new ChromeDriver(cp);
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		s = new SoftAssert();
		WebElement security = null;
		m.get("https://10.11.13.181/");

		try {
			security = m.findElement(By.xpath("//a[contains(text(),'Security')]"));
		} catch (Exception e) {
			System.out.println("Security tab is not visible. Logging in manually...");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

		if (security != null) {
			security.click();

			m.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("rdl@12345");

			String newpass = m.findElement(By.xpath("//input[@id='newPassword']")).getAttribute("value");
			System.out.println("Given password is: " + newpass);

			m.findElement(By.xpath("//input[@id='verifyPassword']")).sendKeys("rdl@12345");

			String confirmpass = m.findElement(By.xpath("//input[@id='verifyPassword']")).getAttribute("value");
			System.out.println("Confirm password is: " + confirmpass);

			m.findElement(By.xpath("//input[@id='ServicePin']")).sendKeys("12345678");
			m.findElement(By.xpath("//input[@id='VerifyServicePin']")).sendKeys("12345678");

			m.findElement(By.xpath("(//input[@value='Apply'])[2]")).click();
		}

		else {
			m.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			m.findElement(By.xpath("//input[@id='PasswordTextBox']")).sendKeys("rdl@12345");
			m.findElement(By.xpath("//input[@id='signInOk']")).click();
		}
	}

	@AfterMethod
	public void screen(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			File src = ((TakesScreenshot) m).getScreenshotAs(OutputType.FILE);
			String time = new SimpleDateFormat("dd_mm_yyyy_hh_MM_ss").format(new Date());
			String path = "C:\\Users\\MadalaSi\\Desktop\\Java\\Seetha\\Rama" + time + ".png";
			FileUtils.copyFile(src, new File(path));
			System.out.println("Screenshot has been taken by the driver");
		}
	}
/*
	@AfterTest
	public void logout() {
		m.findElement(By.xpath("(//a[contains(text(),'Sign Out')])[1]")).click();
		m.quit();
	}
*/
}
