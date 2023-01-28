package MethodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=qj97d7r5dhis");//responscible for opening the web application
		driver.manage().window().maximize();
	      Thread.sleep(4000);
	         String title = driver.getTitle();
	         System.out.println(title);
	         driver.quit();
	}

}
