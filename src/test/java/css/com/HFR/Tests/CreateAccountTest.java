package css.com.HFR.Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import css.com.GlobalTestHelpers;
import css.com.HFR.Pages.HomePage;

public class CreateAccountTest extends GlobalTestHelpers{
	
	HomePage hp=new HomePage(driver);
	
	@Test
	public void createNewAccount(){
		
		clickMethod(hp.createNewAccount);
		String title=getText(hp.signupTitle);
		assertEquals("Wrong signup page opened!", "Sign Up", title);
	}



}
