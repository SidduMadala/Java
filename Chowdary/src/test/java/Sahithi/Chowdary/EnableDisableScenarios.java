package Sahithi.Chowdary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnableDisableScenarios extends EwsLoginPage {
	@Test
	public void enablesdisables() throws Exception {
		m.findElement(By.xpath("//a[@id='SettingsPages']")).click();

		System.out.println("------------------General Settings are started--------------------");

		m.findElement(By.xpath("//a[@id='DisplaySettings']")).click();

		WebElement welcome = m.findElement(By.xpath("//label[contains(text(),' Show Welcome Message')]"));

		String check = welcome.getAttribute("class");
		String enable = "checked";
		Thread.sleep(3000);
		if (check.equals(enable)) {
			System.out.println("Welcome checkbox is already enabled");
			WebElement title = m.findElement(By.xpath("//input[@id='BannerTitle']"));
			title.click();
			title.clear();
			Thread.sleep(3000);
			title.sendKeys("Hi Team,\n");
			WebElement text = m.findElement(By.xpath("//textarea[@id='BannerDescription']"));
			text.clear();
			Thread.sleep(3000);
			text.sendKeys("Please don't distrub the device.\n OOBE testing is inprogress");
			m.findElement(By.id("ff00ff")).click();
			m.findElement(By.id("FormButtonSubmit")).click();
		} else {
			welcome.click();
			System.out.println("Welcome checkbox is enabled now");
			WebElement title = m.findElement(By.xpath("//input[@id='BannerTitle']"));
			title.click();
			title.clear();
			Thread.sleep(3000);
			title.sendKeys("Hi Team,\n");
			WebElement text = m.findElement(By.xpath("//textarea[@id='BannerDescription']"));
			text.clear();
			text.sendKeys("Please don't distrub the device.\n OOBE testing is inprogress");
			m.findElement(By.id("ff00ff")).click();
			m.findElement(By.id("FormButtonSubmit")).click();

		}

		System.out.println("Now, I  am moving to InactivityTimeout Tab");
		Thread.sleep(3000);
		m.findElement(By.id("JobStatistics")).click();
		WebElement deviceuser = m.findElement(By.xpath("//label[@for='DeviceUserStatisticsLogEnable']"));
		String user = deviceuser.getAttribute("class");
		String ena = "checked";
		Thread.sleep(3000);
		if (user.equals(ena)) {
			System.out.println("DeviceUserStatisticsLogEnable, It is already enabled");
		} else {
			Thread.sleep(3000);
			deviceuser.click();
			System.out.println("DeviceUserStatisticsLogEnable, Now, I enabled the option");

			m.findElement(By.id("FormButtonSubmit")).click();
		}

		WebElement optionenable = m
				.findElement(By.xpath("//label[contains(text(),' Send user statistics logs by email ')]"));

		String stause = optionenable.getAttribute("class");
		String users = "checked";
		Thread.sleep(3000);
		if (stause.equals(users)) {
			System.out.println("Send user statistics logs by email, It is already enabled");
		} else {
			optionenable.click();
			System.out.println("Send user statistics logs by email, Now, It is enabled");
			Thread.sleep(2000);
			m.findElement(By.id("FormButtonSubmit")).click();
			Thread.sleep(2000);
			m.findElement(By.id("FormButtonAddSmtpServer")).click();
			Thread.sleep(2000);
			WebElement enter = m.findElement(By.id("SmtpServerName"));
			enter.clear();
			enter.click();
			enter.sendKeys("10.11.12.68");
			m.findElement(By.id("FormButtonNext")).click();
			Thread.sleep(3000);
			m.findElement(By.xpath("//input[@value='Next']")).click();
			m.findElement(By.xpath("//label[contains(text(),' Server requires authentication ')]")).click();
			Thread.sleep(3000);

			// WebElement smtp = m.findElement(By.id("SmtpCredentials"));
			// Thread.sleep(2000);
			Select s = new Select(m.findElement(By.id("SmtpCredentials")));
			Thread.sleep(3000);

			s.selectByValue("1");

			// s.selectByVisibleText("Always use these credentials");

			m.findElement(By.id("SmtpUserName")).clear();
			m.findElement(By.id("SmtpUserName")).click();
			m.findElement(By.id("SmtpUserName")).sendKeys("user2");
			m.findElement(By.id("SmtpPassword")).clear();
			m.findElement(By.id("SmtpPassword")).click();
			m.findElement(By.id("SmtpPassword")).sendKeys("rdl@123");

			WebElement verify = m.findElement(By.xpath("//label[contains(text(),' Verify Access ')]"));

			String en = verify.getAttribute("class");
			String che = "checked";

			if (en.equals(che)) {
				System.out.println("It is already enabled");
			} else {
				verify.click();
				System.out.println("Now, It is enabled");
			}
			m.findElement(By.id("FormButtonNext")).click();
			Thread.sleep(3000);
			m.findElement(By.id("FormButtonNext")).click();
			m.findElement(By.xpath("//input[@value='Finish']")).click();

			Thread.sleep(3000);

			m.findElement(By.id("QuotaServer")).click();
			WebElement Enablelocalquotaservice = m
					.findElement(By.xpath("//label[contains(text(),' Enable local quota service ')]"));

			String local = Enablelocalquotaservice.getAttribute("class");
			String enab = "checked";
			if (local.equals(enab)) {
				System.out.println("Enable local quota service - It is already enabled");
			} else {
				Enablelocalquotaservice.click();
				System.out.println("Enable local quota service - Now It is enabled");
				m.findElement(By.id("FormButtonSubmit")).click();
			}
			System.out.println("----------------------It is related to LocalQuotaConfiguration---------------------");
			Thread.sleep(300);
			m.findElement(By.id("LocalQuotaConfiguration")).click();
			WebElement BlackEmptyPrint = m.findElement(By.id("DefaultMonoPrintSidesCredits"));
			BlackEmptyPrint.click();
			BlackEmptyPrint.clear();
			// BlackEmptyPrint.click();
			BlackEmptyPrint.sendKeys("1000");
			Thread.sleep(3000);
			WebElement ColorPrint = m.findElement(By.id("DefaultColorPrintSidesCredits"));
			ColorPrint.click();
			ColorPrint.clear();
			// ColorPrint.click();
			ColorPrint.sendKeys("1000");
			Thread.sleep(3000);
			WebElement BlackEmptyCopy = m.findElement(By.id("DefaultMonoCopySidesCredits"));
			BlackEmptyCopy.click();
			BlackEmptyCopy.clear();
			// BlackEmptyCopy.click();
			BlackEmptyCopy.sendKeys("1000");
			Thread.sleep(3000);
			WebElement ColorCopy = m.findElement(By.id("DefaultColorCopySidesCredits"));
			ColorCopy.click();
			ColorCopy.clear();
			// ColorCopy.click();
			ColorCopy.sendKeys("1000");
			Thread.sleep(3000);
			WebElement DigitalSend = m.findElement(By.id("DefaultScannedSidesCredits"));
			DigitalSend.click();
			DigitalSend.clear();
			// DigitalSend.click();
			DigitalSend.sendKeys("1000");
			Thread.sleep(3000);

			m.findElement(By.id("FormButtonSubmit")).click();

			System.out.println("------------It is related to costs---------------");

			try {
				WebElement ChargedoubleforA3and11x17 = m
						.findElement(By.xpath("//label[contains(text(),' Charge double for A3 and 11x17 ')]"));

				String checkboxClass = ChargedoubleforA3and11x17.getAttribute("class");

				boolean isChecked = checkboxClass.contains("checked");

				if (isChecked) {
					System.out.println("ChargedoubleforA3and11x17 - It is already enabled");
				} else {
					ChargedoubleforA3and11x17.click();
					System.out.println("ChargedoubleforA3and11x17 - Now it is enabled");
				}
			} catch (Exception e) {
				System.out.println(
						"Exception occurred while handling ChargedoubleforA3and11x17 checkbox: " + e.getMessage());
			}

			Thread.sleep(3000);
			WebElement ColorPrintSideCostField = m.findElement(By.id("ColorPrintSideCostField"));
			ColorPrintSideCostField.click();
			ColorPrintSideCostField.clear();
			// ColorPrintSideCostField.click();
			ColorPrintSideCostField.sendKeys("10");
			System.out.println("Now, it is completed ColorPrintSideCostField");
			Thread.sleep(3000);
			WebElement BlackPrintSideCostField = m.findElement(By.id("BlackPrintSideCostField"));
			BlackPrintSideCostField.click();
			BlackPrintSideCostField.clear();
			// BlackPrintSideCostField.click();
			BlackPrintSideCostField.sendKeys("11");
			System.out.println("Now, it is completed BlackPrintSideCostField");
			Thread.sleep(3000);
			WebElement EmptyPrintSideCostField = m.findElement(By.id("EmptyPrintSideCostField"));
			EmptyPrintSideCostField.click();
			EmptyPrintSideCostField.clear();
			// EmptyPrintSideCostField.click();
			EmptyPrintSideCostField.sendKeys("12");
			System.out.println("Now, it is completed EmptyPrintSideCostField");
			Thread.sleep(3000);
			WebElement ScannedSideCostField = m.findElement(By.id("ScannedSideCostField"));
			ScannedSideCostField.click();
			ScannedSideCostField.clear();
			// ScannedSideCostField.click();
			ScannedSideCostField.sendKeys("13");
			System.out.println("Now, it is completed ScannedSideCostField");
			Thread.sleep(3000);

			m.findElement(By.id("FormButtonSubmit")).click();

			Thread.sleep(3000);
			m.findElement(By.id("DefaultUpdateAllButton")).click();
			Thread.sleep(5000);
			m.findElement(By.id("FormUpdateAndReset")).click();
			System.out.println("In Local Quota Configuration Update and Reset is completed");

			Thread.sleep(5000);
			WebElement ScheduleType = m.findElement(By.id("ScheduleType"));
			Select si = new Select(ScheduleType);
			Thread.sleep(2000);
			si.selectByValue("EmailAndResetQuotaCredits");

			m.findElement(By.id("FormButtonSubmit")).click();

		}
	}
}
