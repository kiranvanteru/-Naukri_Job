package naukriUtil;

public class InitializeURL {

	
	public void launchURL(String URL){
		if (URL!=null){
		DriverInitialize.driver.manage().window().maximize();
		DriverInitialize.driver.get(URL);
		}
	}
}
