package Webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 driver.navigate().to("https://www.java.com/en/");
		 Thread.sleep(4000);
		 driver.navigate().forward();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 Thread.sleep(4000);
		 driver.close();
		 
		}

	}
	


