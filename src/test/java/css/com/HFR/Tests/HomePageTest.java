package css.com.HFR.Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import css.com.GlobalTestHelpers;
import css.com.HFR.Data.HomePageData;
import css.com.HFR.Pages.HomePage;

public class HomePageTest extends GlobalTestHelpers {
	
HomePageData data=new HomePageData();
	
    @Test
    public void submitUserProfile_CSS_121() {
        //String firstName = "AKM";
        //String dob = "01/01/2001";
        String message = new HomePage(driver)
                .submitUserProfileForm(data.firstName, data.dob)
                .getUserProfileSuccessMessage();
        assertEquals("Failed - submit user profile not successful", "blakjl", message);
    }

}
