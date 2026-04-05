package Sahithi.Chowdary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Trails extends EwsLoginPage {
	WebElement add = m.findElement(By.id("ButtonAddEmail"));
	String val = add.getAttribute("disabled");
	String dis = "disabled";
	
	@Test
	public void enablesdisables() throws Exception {

		m.findElement(By.xpath("//a[@id='SettingsPages']")).click();
		m.findElement(By.xpath("//a[@id='DisplaySettings']")).click();

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
			m.findElement(By.id("FormButtonSubmit")).click();

			
		}
		
			/*
			WebElement smp = m.findElement(By.id("SmtpServerName_0"));
			
			WebElement edit = m.findElement(By.id("FormButtonEditSmtpServer"));
			
			
			String server = smp.getAttribute("class");
			String names = "checked";
			
			if(server.equals(names)&&smp.isDisplayed()) {
				
			smp.click();
			
			}
			else {
			
		
		
			
			m.findElement(By.id("FormButtonAddSmtpServer")).click();
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
		
		
		
		try {
			
			if(val.equals(dis)) {
				System.out.println("It is not possible to add the users");
				
			}
		
		}
		catch (Exception e) {
			
			
			WebElement adds = m.findElement(By.id("ButtonAddEmail"));
			String as = adds.getAttribute("value");
			String ad = "Add";
			
			WebElement rec = m.findElement(By.id("AddEmailAddress"));
			rec.click();
			rec.sendKeys("user1@dodca.com");
			WebElement add5 = m.findElement(By.id("ButtonAddEmail"));
			add5.click();

			Thread.sleep(3000);
			WebElement rec1 = m.findElement(By.id("AddEmailAddress"));
			rec1.click();
			rec1.sendKeys("user2@dodca.com");
			WebElement add1 = m.findElement(By.id("ButtonAddEmail"));
			add1.click();

			Thread.sleep(3000);
			WebElement rec2 = m.findElement(By.id("AddEmailAddress"));
			rec2.click();
			rec2.sendKeys("user3@dodca.com");
			WebElement add2 = m.findElement(By.id("ButtonAddEmail"));
			add2.click();

			Thread.sleep(3000);
			WebElement rec3 = m.findElement(By.id("AddEmailAddress"));
			rec3.click();
			rec3.sendKeys("user4@dodca.com");
			WebElement add3 = m.findElement(By.id("ButtonAddEmail"));
			add3.click();

			Thread.sleep(3000);
			WebElement rec4 = m.findElement(By.id("AddEmailAddress"));
			rec4.click();
			rec4.sendKeys("user5@dodca.com");
			WebElement add4 = m.findElement(By.id("ButtonAddEmail"));
			add4.click();
			
			
			
			e.printStackTrace();
			e.getMessage();
			e.getStackTrace();
			
		}
	
		
		
		
		
		
		Thread.sleep(3000);
		WebElement codes = m.findElement(By.xpath("//label[contains(text(),' Include user access codes ')]"));

		Thread.sleep(3000);
		String cod = codes.getAttribute("class");
		String access = "checked";
		if (cod.equals(access)) {
			
			System.out.println("It is already enabled");
		} else {
			codes.click();
			System.out.println("Now, It is enabled");
		}
		
		m.findElement(By.id("FormButtonSubmit")).click();
		*/
		
		
		
		m.findElement(By.id("QuotaServer")).click();
		WebElement Enablelocalquotaservice = m.findElement(By.xpath("//label[contains(text(),' Enable local quota service ')]"));
		
		String local = Enablelocalquotaservice.getAttribute("class");
		String enab = "checked";
		if(local.equals(enab)) {
			System.out.println("Enable local quota service - It is already enabled");
		}
		else {
			System.out.println("Enable local quota service - Now It is enabled");
		}
		
		m.findElement(By.id("FormButtonSubmit")).click();
		
		}
		
}
