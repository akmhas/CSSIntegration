package helpers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import css.com.GlobalTestHelpers;

public class TestHelpers extends GlobalTestHelpers {
	
    @BeforeMethod
    public void setupTest() {
        driver.get("https://www.facebook.com/");
    }
    


}
