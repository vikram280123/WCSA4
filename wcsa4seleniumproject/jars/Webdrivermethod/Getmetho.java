package Webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmetho {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		 Thread.sleep(4000);
		 String vikram=driver.getTitle();
		 System.out.println(vikram);
		 driver.close();

	}

}