package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vikram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(4000);
		driver.close();
		driver.findElement(By.name("username")).sendKeys("vicky");
		Thread.sleep(4000);
		driver.close();
	}

}
