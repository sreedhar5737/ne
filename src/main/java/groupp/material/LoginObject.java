package groupp.material;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {

	public WebDriver driver;
	
	public LoginObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@src='Images/start_enter.gif']")
	WebElement enter;
	
	
	@FindBy(name="txtUserId")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement proceed;
	
	@FindBy(name="PlRb")
	WebElement plantselection;
	
	@FindBy(name="ContBtn")
	WebElement plantselectioncontinue;
	
	
	public WebElement enterbtn()
	{
	return enter;
	}
	
	public WebElement username()
	{
	return username;
	}
	
	public WebElement password()
	{
	return password;
	}
	
	public WebElement proceed()
	{
	return proceed;
	}
	
	public WebElement plantselection()
	{
	return plantselection;
	}
	
	public WebElement plantselectioncontinue()
	{
	return plantselectioncontinue;
	}
	
}
