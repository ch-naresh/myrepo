package tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.basepage;
import pagefactory.HomePage;
import pagefactory.LoginPage;
import utilities.MyListener;
import utilities.Xls_DataProvider;

@Listeners(value=MyListener.class)
public class LoginTest extends  basepage  {
	
	WebDriver d;
	HomePage  h;
	LoginPage l;
	@DataProvider(name = "loginData")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = Xls_DataProvider.getTestData("Sheet1");
		return input;
	}

	
  @Test(dataProvider = "loginData")
  public void testLogin(String u, String p) {
 
	  h.clickLoginLink();
	  l.enterLoginDetails(u, p);
  }
  
  @BeforeTest()
  public void setup() throws MalformedURLException {
	  openBrowser();
	  h=new HomePage();
	  l=new LoginPage();

  }
}

