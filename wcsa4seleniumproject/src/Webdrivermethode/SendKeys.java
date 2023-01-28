package Webdrivermethode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    WebElement usernametextbox = driver.findElement(By.name("username"));
		    usernametextbox.sendKeys("Admin");
		                 WebElement passwordtextfield = driver.findElement(By.name("password"));
		                 passwordtextfield .sendKeys("admin123");
		                 driver.findElement(By.xpath(null));
	}

}
