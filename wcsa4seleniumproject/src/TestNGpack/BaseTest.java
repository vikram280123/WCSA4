package TestNGpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
  
  static WebDriver driver;
	@BeforeMethod
	public void setUp() {
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://127.0.0.1/login.do;jsessionid=2t7vlajg942x2");  
		}
	}
	
	@AfterMethod
	 public void tearDown()
	 {
     driver.quit();		
}
}
