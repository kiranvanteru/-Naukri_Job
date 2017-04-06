package naukriUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInitialize {
	
	public static WebDriver driver;
	
	public WebDriver openBrowser(String browser){
		
		switch(browser){
		
		case "firefox":
		{
			driver=new FirefoxDriver();
		}
		
		case "Chrome":
		{
			driver=new ChromeDriver();
		}
		
		case "ie":
		{
			driver=new InternetExplorerDriver();
		}
		
		}
		return driver;
	}

}
