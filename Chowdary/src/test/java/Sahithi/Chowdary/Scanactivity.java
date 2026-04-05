package Sahithi.Chowdary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Scanactivity {
	public WebDriver m;
	int count = 0;

	public void scanactivities() throws InterruptedException {
/*
		WebElement condition = m.findElement(By.id("ConditionNotify"));
		Select siddum = new Select(condition);
		siddum.selectByValue("Always");
		m.findElement(By.id("EmailAddress")).click();
		m.findElement(By.id("EmailAddress")).sendKeys("user2@dodca.com");
		m.findElement(By.xpath("//label[contains(text(),' Include thumbnail ')]")).click();
*/
		
		Thread.sleep(1000);
		m.findElement(By.xpath("//input[@id='FormButtonNext']")).click();
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

		m.findElement(By.xpath("(//input[@type=\"submit\"])[4]")).click();
/*
		try {
			WebElement watermark = m.findElement(By.id("SendWatermarkType"));
			Select mad = new Select(watermark);
			mad.selectByVisibleText("Text");
			WebElement customwatermark = m.findElement(By.id("SendWatermarkCustomText"));
			customwatermark.click();
			customwatermark.sendKeys("Rama");
			WebElement textfont = m.findElement(By.id("SendWatermarkFont"));
			Select dam = new Select(textfont);
			dam.selectByVisibleText("New Century Schoolbook Roman");
			WebElement textsize = m.findElement(By.id("SendWatermarkTextSize"));
			Select amd = new Select(textsize);
			amd.selectByVisibleText("60 point");
			WebElement textcolor = m.findElement(By.id("SendWatermarkTextColor"));
			Select dma = new Select(textcolor);
			dma.selectByVisibleText("Purple");
			WebElement darkness = m.findElement(By.id("SendWatermarkDarkness"));
			Select adm = new Select(darkness);
			adm.selectByVisibleText("5 - (Darker)");

			Thread.sleep(2000);
			m.findElement(By.xpath("//strong[contains(text(),'Top Left')]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//label[@for='OptionalStamp_IPAddress_TopLeft']")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//strong[contains(text(),'Top Center')]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("(//label[contains(text(),' User name ')])[1]")).click();
			Thread.sleep(2000);
			// m.findElement(By.xpath("")).click();
			// Thread.sleep(2000);
			m.findElement(By.xpath("(//label[contains(text(),' Product information ')])[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Watermark amd stamps page is available and it is already configured it");
		}
*/
		Thread.sleep(2000);
		 m.findElement(By.id("FormButtonNext")).click();

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
		m.findElement(By.xpath("//input[@id='FormButtonNext']")).click();
		Thread.sleep(1000);
		
		m.findElement(By.xpath("//div[@class='buttons fixed']//span//input[@id='FormButtonFinish']")).click();
		System.out.println("No of Quicksets completed_" + count++ );
	}
}

