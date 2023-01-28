package takeScreenshotmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
	           File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           
	           Files.copy(f, new File("C:\\Users\\213\\Downloads\\sample\\facebookscreenshot.jpg"));
	           Thread.sleep(2000);
	           driver.close();
	      
	         
	            
	           
	}

}
