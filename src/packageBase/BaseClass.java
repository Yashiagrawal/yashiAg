package packageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


	public WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
//OpenBrowser
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashi\\Downloads\\chromedriver_win32new\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Enter Url
	//driver.get("http://www.naukri.com");
	//driver.get("http://db.sendan.com.sa/sendan/index.php");
	  //driver.get("https://www.cheapoair.com");
	//driver.get("https://www.cheapoair.com");
	//driver.get("http://61.95.220.248:9092/user/login/");
	//driver.get("http://www.snapdeal.com");
   // driver.get("https://www.flydubai.com/en/");

	//driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);


	//driver.get("http://snapdeal.com");
	}
	@AfterMethod
	public void quitBrowser() {
	//driver.quit();
}
}