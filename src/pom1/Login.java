package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//input[@id='email'] ") private WebElement UserName;
	@FindBy(xpath="//input[@id='pass']") private WebElement Password;
	@FindBy(xpath="//button[@id='u_0_b']") private WebElement Submit;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginUN(String user)
	{
		UserName.sendKeys(user);
	}
	
	public void LoginPWD(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void LoginLN()
	{
		Submit.click();
	}

}
