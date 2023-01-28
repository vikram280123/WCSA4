package SelectclassMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getoption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/213/Desktop/webpage/d.html");
//		
//		
//	            WebElement dropDownElement = driver.findElement(By.id("menu"));
//	                        select sel = new select (dropDownElement);
//	                        
	}

}
