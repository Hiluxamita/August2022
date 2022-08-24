package org.loginpageexecution;

import org.baseutility.BaseClass;
import org.loginpagefactory.LoginPageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageExecution extends BaseClass{

	@Parameters({"data"})
	@BeforeMethod
	public void url(String data) {
		driver.get(data);
		
	}
	
	@Test
	public void send() {
		LoginPageFactory lp=new LoginPageFactory();
		type(lp.getUsername(),"Amita");
		type(lp.getPassword(),"Lux");
		
	}
}
