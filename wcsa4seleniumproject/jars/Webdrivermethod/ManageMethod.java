package Webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.google.com");
	//	 Thread.sleep(2000);
		 
		//          Dimension targetsize = new Dimension(250,350)
	}

}
