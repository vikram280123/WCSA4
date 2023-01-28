package Webdrivermethode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
                   boolean status = driver.findElement(By.xpath("//a[.='Forgotten password?']")).isEnabled();
		 System.out.println(status);
		 Thread.sleep(2000);
		 driver.close();
		 if (status==true) {
			 System.out.println("link is enabled");
			
		}
		 else {
			System.out.println("link is not enabled");
		}
		
	}

}
