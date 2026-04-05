package Sahithi.Chowdary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Onedestination extends Embededwebserviceslogpage {
	int i = 1;
	int j = 1;

	@Test(invocationCount = 200, priority = 5, groups = { "sanity" })
	public void snf() throws Exception {

		Thread.sleep(2000);
		m.findElement(By.id("SendPages")).click();
		m.findElement(By.xpath("(//a[@href='/hp/device/Folder/Index'])[1]")).click();
		m.findElement(By.xpath("(//a[text()='Quick Sets'])[2]")).click();
		m.findElement(By.xpath("//input[@id='AddQuickSetButton']")).click();
		m.findElement(By.xpath("//input[@id='QuickSetTitle']")).click();

		m.findElement(By.xpath("//input[@id='QuickSetTitle']")).sendKeys("scanToNetworkfolder_" + j++);
		m.findElement(By.xpath("//input[@id='FormButtonNext']")).click();

		for (int p = 1; p < 2; p++) {

			m.findElement(By.xpath("//input[@id='SharedFolderAdd']")).click();

			m.findElement(By.xpath("//input[@id='UncPath']"))
					.sendKeys("\\\\2406-7400-f5-86e-d84d-2377-7f4a-f559.ipv6-literal.net\\IPV6TEST\\Ankitha" + i++);

			WebElement cred = m.findElement(By.xpath("//select[@id='UseMfpSignInCredentials']"));
			Select s = new Select(cred);
			s.selectByValue("False");
			m.findElement(By.xpath("//input[@id='UncUsername']")).sendKeys("Admin");
			m.findElement(By.xpath("//input[@id='UncPassword']")).sendKeys("Ashya");

			m.findElement(By.xpath("//input[@id='FormButtonSubmit']")).click();
			// m.findElement(By.xpath("//input[@id='FormButtonNext']")).click();
			Thread.sleep(2000);
			m.findElement(By.id("FormButtonFinish")).click();

		}
	}
}