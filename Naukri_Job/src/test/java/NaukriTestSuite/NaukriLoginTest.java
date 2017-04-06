package NaukriTestSuite;

import java.util.concurrent.TimeUnit;

import naukri.Login.pageFact.Login;
import naukri.Login.pageFact.NaukriHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaukriLoginTest {
	
	WebDriver driver;
	Login Nlg;
	NaukriHome mnp;
	
	@BeforeTest
	public void Before() {
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		System.out.println("Sending to git");
	  }
	
	
	
  @Test
  public void f() {
	  
 
	  Nlg=PageFactory.initElements(driver, Login.class);
	  mnp=PageFactory.initElements(driver, NaukriHome.class);
	  
	  Nlg.LoginNaukriHome("kiranv23", "kiran1234");
	  mnp.MyHomePage();
	  
	  driver.quit();
	  
	  
  }
}
