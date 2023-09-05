package smallworld.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import smallworld.TestComponents.BaseTest;
import smallworld.pageobjects.HomePage;
import smallworld.pageobjects.LoginPage;

public class StepDefinitionImpl extends BaseTest{

	public LoginPage loginPage;
	public HomePage homePage;
//	public ConfirmationPage confirmationPage;

	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException
	{
		loginPage = launchApplication();
		//code
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password)
	{
		homePage = loginPage.loginApplication(username,password);
	}
	
    @Then("Logged out from Application")
    public void logged_out_from_application() throws InterruptedException
    {
    	homePage.logoutApplication();
		Thread.sleep(3000);
		driver.close();
    }
    
    @Then("{string} Header Label message is displayed on Homepage")
    public void message_displayed_confirmationPage(String string) throws InterruptedException
    {
    	String confirmMessage = homePage.getAppLogoText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		Thread.sleep(3000);
    }
    
    @And("Close the Browser")
    public void close_browser() throws InterruptedException
    {
		driver.close();
        driver.quit();
    }
	
}
