package WebElementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://127.0.0.1/login.do;jsessionid=4j9p3l56wvsb4");
	
	                          WebElement logo = driver.findElement(By.xpath("//img[@src='/img/default/logo.gif?hash=1692528820']"));
	                         boolean status = logo.isDisplayed();
	                         driver.close();
}                                       
}
