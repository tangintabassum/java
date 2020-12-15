package browserConfiguration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	WebDriver driver;
	
	
	public WebDriver openBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nazmul\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		if (driver==null)
		{
		driver=new ChromeDriver();
		
		driver.get("http://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

}
