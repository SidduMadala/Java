package Sahithi.Chowdary;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ScanPlusEmail extends Embededwebserviceslogpage {
	int mail = 1;
	int count = 1;
	WebDriverWait wait = new WebDriverWait(m, Duration.ofSeconds(10));

	@Test
	public void Airedact() throws InterruptedException {
		m.findElement(By.id("SendPages")).click();
		m.findElement(By.id("ScanPlusGroup")).click();
		m.findElement(By.id("QuickSetsScanPlus")).click();
		m.findElement(By.id("AddQuickSetButton")).click();
		m.findElement(By.id("QuickSetTitle")).sendKeys("ScanToEmail" + mail);
		Thread.sleep(2000);
		m.findElement(By.id("FormButtonNext")).click();
		WebElement sid = m.findElement(By.xpath("//label[@for='UnhideEwsEmailSettings']"));
		@Nullable
		String madala = sid.getAttribute("class");
		String check = "checked";

		if (madala.equals(check)) {
			System.out.println("It is already enabled");
		} else {
			sid.click();
			System.out.println("Now, the option is enabled");
		}
		m.findElement(By.id("EmailFromAddress")).sendKeys("user2@dodca.com");
		m.findElement(By.id("EmailFromDisplayName")).sendKeys("Mail");
		Thread.sleep(2000);

		m.findElement(By.id("FormButtonFinish")).click();

		System.out.println(
				"------------------------------------------------------------------------------------------------------");
		Thread.sleep(2000);
		m.findElement(By.xpath("(//a[contains(text(),'Default Job Options')])[4]")).click();

		WebElement condition = m.findElement(By.id("ConditionNotify"));
		Select siddum = new Select(condition);
		siddum.selectByValue("Always");
		m.findElement(By.id("EmailAddress")).click();
		m.findElement(By.id("EmailAddress")).sendKeys("user2@dodca.com");
		m.findElement(By.xpath("//label[contains(text(),' Include thumbnail ')]")).click();

		Thread.sleep(1000);

		WebElement sele = m.findElement(By.id("OriginalSize"));
		System.out.println("It is clicked on the taskbar");
		Select s = new Select(sele);
		System.out.println("It is selected on the line");
		Thread.sleep(1000);
		s.selectByValue("15");
		System.out.println("A4 is selected");
		WebElement sides = m.findElement(By.xpath("//select[@id='OriginalSides']"));
		Select s2 = new Select(sides);
		s2.selectByValue("1");

		// m.findElement(By.xpath("(//input[@type=\"submit\"])[4]")).click();

		Thread.sleep(1000);
		WebElement filename = m.findElement(By.id("FileNamePrefixButton"));
		filename.click();
		Thread.sleep(1000);
		m.findElement(By.xpath("//a[contains(text(),'Asset Number (%DEVICE_ASSETNUMBER%)')]")).click();
		Thread.sleep(1000);
		WebElement filename2 = m.findElement(By.id("FileNamePrefixButton"));
		filename2.click();
		Thread.sleep(1000);
		m.findElement(By.xpath("//a[contains(text(),'Host Name (%DEVICE_HOSTNAME_PQDN%)')]")).click();

		m.findElement(By.xpath("//input[@id='FileName']")).clear();
		m.findElement(By.xpath("//input[@id='FileName']")).sendKeys("Quickset");
		WebElement dpi = m.findElement(By.xpath("//select[@id='Resolution']"));
		Select s3 = new Select(dpi);
		s3.selectByValue("8");
		m.findElement(By.xpath("//label[@for='BlankPageSuppression']")).click();
		Thread.sleep(1000);

		System.out.println("No of Quicksets completed_" + count++);
		System.out.println("-----------------------------It is Related to AI Redact----------------------------");

		WebElement AIRedact = m.findElement(By.xpath("//label[contains(text(),' AI Redact ')]"));
		@Nullable
		String Redact = AIRedact.getAttribute("class");
		String airedact = "checked";
		if (Redact.equals(airedact)) {
			System.out.println(" AI Redact is already enabled");
		} else {
			AIRedact.click();
			System.out.println("AI Redact option is enabled now");
		}
		Thread.sleep(2000);
		List<WebElement> ma = m.findElements(By.xpath("(//div[@class=\"line single-line double-width\"])[2]"));
		for (WebElement sima : ma) {
			String text = sima.getText().trim();

			if (text.equalsIgnoreCase("National ID numbers")
					|| text.equalsIgnoreCase("Financial account and credit card numbers")
					|| text.equalsIgnoreCase("Passport numbers")) {
				continue;
			}
			List<WebElement> checked = sima.findElements(By.xpath(
					"//div[@id='AutoRedactSettingsSectionId']//div[@class='line single-line double-width']//label"));
			for (WebElement che : checked) {
				String str1 = che.getAttribute("class");
				if (airedact.equals(str1)) {
					continue;
				} else {
					che.click();
					Thread.sleep(2000);
				}
			}
			WebElement sidhu = m.findElement(By.id("AutoRedactText"));
			sidhu.click();
			sidhu.clear();
			sidhu.sendKeys("Device");
		}
	}
}
