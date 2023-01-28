package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=qj97d7r5dhis");
		driver.manage().window().maximize();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("//input[@name='username'")).sendKeys("admin");
	     
	}

}
