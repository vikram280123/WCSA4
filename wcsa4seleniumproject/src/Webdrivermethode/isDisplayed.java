package Webdrivermethode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 boolean status = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		 System.out.println(status);
		 driver.close();
		 if (status==true) {
			 System.out.println("logo is displayes");
			
		}
		 else {
			System.out.println("logo is not displayed");
		}
		 
	}

}
