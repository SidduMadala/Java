package PagObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details {

	WebDriver m;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public Details(WebDriver m) {
		this.m = m;
		PageFactory.initElements(m, this);
	}

	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
}
