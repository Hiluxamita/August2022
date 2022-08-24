package org.loginpagefactory;

import org.baseutility.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BaseClass {

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public LoginPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement Username;
	
	@FindBy(id="passContainer")
	private WebElement password;
}
