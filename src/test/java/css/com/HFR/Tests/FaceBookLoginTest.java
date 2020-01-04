package css.com.HFR.Tests;

import org.testng.annotations.Test;

import css.com.HFR.Data.HomePageData;
import css.com.HFR.Pages.HomePage;
import helpers.TestHelpers;

public class FaceBookLoginTest extends TestHelpers {
	
	HomePage hp=new HomePage(driver);
	HomePageData hpd=new HomePageData();
	
	@Test
	public void loginFailTest(){
		hp.loginFacebook(hpd.userEmail,hpd.userPassword);
		
	}

}
