package css.com.HFR.Tests;

import org.testng.annotations.Test;
import css.com.GlobalTestHelpers;
import css.com.HFR.Pages.HomePage;
import css.com.GlobalPageHelpers;

public class FooterLinkCountTest extends GlobalTestHelpers {
	
	HomePage hp=new HomePage(driver);
	
	@Test
	public void footerCountTest (){
		
		String textValue=getText(hp.footerLink);
		System.out.println(textValue);
	}

}
