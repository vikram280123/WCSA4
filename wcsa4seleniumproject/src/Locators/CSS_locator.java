package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	      Thread.sleep(4000);
	      driver.findElement(By.tagName("input")).sendKeys("vikram");
	      driver.findElement(By.cssSelector("button[value='LogIn']")).click();
	     
		

	}

}
