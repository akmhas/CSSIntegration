package css.com.HFR.Pages;
import css.com.GlobalPageHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends GlobalPageHelpers{

	//Facebook test Concept

	public By emailAddress		=	By.name("email");
	public By emailPassword		=	By.xpath("//input[@name='pass']");	
	public By loginButton		=	By.cssSelector("button[name='login']");
	public By footerLink		=	By.xpath("//*[@id='js_0']/ul/li[2]/a");
	public By createNewAccount	=	By.linkText("Create New Account");
	public By signupTitle		=	By.xpath("//*[@id='facebook']/body/div[3]/div[2]/div/div/div[1]/div[1]");

	/*int i=0;
		String part1="//*[@id='js_0']/ul/li[";
		String part2="]/a";
		String complatePath=part1+i+part2;*/

	public void loginFacebook(String email,String password){

		setField(emailAddress,email);
		setField(emailPassword,password);
		clickMethod(loginButton);
	}



	//General Test Concept
	public By firstNameField = By.id("first-name");
	public By dobField = By.name("dob-user");
	public By statusText = By.className("status-message");
	public By submitButton=By.id("Submit Button");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage submitUserProfileForm(String firstName, String dob) {
		setField(firstNameField, firstName);
		setField(dobField, dob);
		//TODO to click on submit button;
		clickMethod(submitButton);

		return this;
	}

	public String getUserProfileSuccessMessage() {
		return getText(statusText);
	}


}
