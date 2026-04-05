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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Embededwebserviceslogpage {

	protected WebDriver m;

	@BeforeClass
	public void setUp() {
		System.out.println("========== Starting Browser ==========");

		try {
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("--log-level=3");
			options.addArguments("--disable-logging");
			// options.addArguments("--headless"); // enable only if no UI needed

			m = new ChromeDriver(options);
			m.manage().window().maximize();
			m.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(m, Duration.ofSeconds(10));

			// You can maintain a list of printer IPs to test
			String[] printerIPs = { "https://10.11.13.169" };
			// "https://146.204.93.86/"};

			boolean connected = false;
			for (String url : printerIPs) {
				try {
					m.get(url);
					System.out.println("✅ Accessed printer: " + url);
					connected = true;
					break;
				} catch (Exception e) {
					System.out.println("❌ Failed to access: " + url);
				}
			}

			if (!connected) {
				throw new RuntimeException("No printer URL accessible!");
			}

			// Login section
			try {
				WebElement securityTab = m.findElement(By.id("SecurityPages"));
				securityTab.click();
				m.findElement(By.id("newPassword")).sendKeys("rdl@12345");
				m.findElement(By.id("verifyPassword")).sendKeys("rdl@12345");
				m.findElement(By.id("FormButtonSubmit")).click();
				System.out.println("✅ Password set successfully");
			} catch (Exception e) {
				System.out.println("ℹ️ Security tab not visible. Attempting login...");
				try {
					m.findElement(By.id("EwsLogin")).click();
					m.findElement(By.id("PasswordTextBox")).sendKeys("rdl@12345");
					m.findElement(By.id("signInOk")).click();
					System.out.println("✅ Login successful");
				} catch (Exception ex) {
					System.out.println("❌ Login failed. Check element locators or credentials.");
					ex.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("❌ Browser setup failed: " + e.getMessage());
		}

		System.out.println("========== Browser Setup Complete ==========");
	}

	@AfterMethod
	public void captureScreenshotOnFailure(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE && m != null) {
			File src = ((TakesScreenshot) m).getScreenshotAs(OutputType.FILE);
			String time = new SimpleDateFormat("dd_MM_yy_HH_mm_ss").format(new Date());
			String filePath = "C:\\Users\\Admin\\Desktop\\Rama\\Seetha_" + time + ".png";
			FileUtils.copyFile(src, new File(filePath));
			System.out.println("📸 Test failed! Screenshot saved at: " + filePath);
		}
	}

	@AfterClass
	public void tearDown() {
		if (m != null) {
			// m.quit();
			System.out.println("🧹 Browser closed successfully.");
		}
	}
}
