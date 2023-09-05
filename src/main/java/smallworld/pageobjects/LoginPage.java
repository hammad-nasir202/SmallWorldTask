package smallworld.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smallworld.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
	//PageFactory
	
	@FindBy(id="user-name")
	WebElement userEmail;
	
	@FindBy(id="password")
	WebElement passwordEle;
	
	@FindBy(id="login-button")
	WebElement submit;


	
	public HomePage loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		HomePage homePage = new HomePage(driver);
		return homePage;
				
	}
	
	
	public void goTo()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
