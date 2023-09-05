package smallworld.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import smallworld.AbstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		// initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="react-burger-menu-btn")
	WebElement burgerMenuBtn;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutBtn;
	
	@FindBy(className ="app_logo")
	WebElement appLogo;

	
	public LoginPage logoutApplication() throws InterruptedException
	{

		burgerMenuBtn.click();
		Thread.sleep(2000);
		logoutBtn.click();

		LoginPage loginPage = new LoginPage(driver);
		return loginPage;
				
	}
	
    public String getAppLogoText() {
        return appLogo.getText();
    }
	
	
	
	

}
