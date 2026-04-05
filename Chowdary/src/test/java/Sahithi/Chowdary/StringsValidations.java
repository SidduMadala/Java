package Sahithi.Chowdary;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StringsValidations extends EwsLoginPage {

	@Test
	public void strindvalidation() {
		m.findElement(By.xpath("(//a[contains(text(),'Information')])[1]")).click();
		m.findElement(By.xpath("//a[@id='DeviceStatus']")).click();

		try {
			String yellow = m.findElement(By.xpath("//h2[contains(text(),'Yellow Cartridge')]")).getText();
			s.assertEquals(yellow, "Yellow Cartridge", "Spelling is mismatched");

			String Magenta = m.findElement(By.xpath("//h2[contains(text(),'Magenta Cartridge')]")).getText();
			s.assertEquals(Magenta, "Magenta Cartridge", "Spelling is mismatched");

			String Cyan = m.findElement(By.xpath("//h2[contains(text(),'Cyan Cartridge')]")).getText();
			s.assertEquals(Cyan, "Cyan Cartridge", "Spelling is mismatched");

			String Document = m.findElement(By.xpath("//h2[contains(text(),'Document Feeder Kit')]")).getText();
			s.assertEquals(Document, "Document Feeder Kit", "Spelling is mismatched");
		} catch (Exception e) {
			String Black = m.findElement(By.xpath("//h2[contains(text(),'Black Cartridge')]")).getText();
			s.assertEquals(Black, "Black Cartridge", "Spelling is mismatched");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());

		}
		try {
			String adf = m.findElement(By.xpath("//h2[contains(text(),'ADF Separation Pad')]")).getText();
			s.assertEquals(adf, "ADF Separation Pad", "Spelling is mismatched");
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		m.findElement(By.xpath("//a[contains(text(),'Configuration Page')]")).click();
		String product = m.findElement(By.xpath("//strong[@id='ProductName']")).getText();
		s.assertEquals(product, product);
		System.out.println("Device product name is: " + product);
		String model = m.findElement(By.xpath("//strong[@id='ModelNumber']")).getText();
		System.out.println("Device model number is: " + model);
		String serial = m.findElement(By.xpath("//strong[@id='SerialNumber']")).getText();
		System.out.println("Device serial number is: " + serial);
		String firmware = m.findElement(By.xpath("//strong[@id='FirmwareRevision']")).getText();
		System.out.println("Device Firmware Version is: " + firmware);
		String speed = m.findElement(By.xpath("//span[@id='PPMStatusTitle']")).getText();
		System.out.println("Engine Speed is: " + speed);
		String memory = m.findElement(By.xpath("//strong[@id='TotalMemory']")).getText();
		System.out.println("TotalMemory is: " + memory);
		String webservices = m.findElement(By.xpath("//strong[@id='EPrintWebServiceItem']")).getText();
		System.out.println("Status of webservices is: " + webservices);
		String tpmstatus = m.findElement(By.xpath("//strong[@id='TPMTitle']")).getText();
		System.out.println("TPM Status is: " + tpmstatus);
		s.assertAll();
	}
}
