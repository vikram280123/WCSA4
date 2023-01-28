package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnamelocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
      Thread.sleep(2000);
      driver.findElement(By.className("form_input")).sendKeys("testing");
      Thread.sleep(2000);
      driver.close();
	}

}
