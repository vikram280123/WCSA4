package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatef {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		driver.get("http://www.amazon.com/");
		
		Thread.sleep(4000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		driver.navigate().forward();
		
		Thread.sleep(4000);
		driver.quit();
	}

}
