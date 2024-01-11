package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basepage;

public class LoginPage extends  basepage  {
	
	@FindBy(id="Email")
	static WebElement TxtBox_Username;
	
	@FindBy(id="Password")
	static WebElement TxtBox_Password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	static WebElement Btn_Login;
	
	
	public void enterLoginDetails(String u,String p)
	{
		 TxtBox_Username.sendKeys(u);
		 TxtBox_Password.sendKeys(p);
		 Btn_Login.click();
	}
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
}
