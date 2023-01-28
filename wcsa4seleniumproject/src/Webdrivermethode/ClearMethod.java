package Webdrivermethode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=3tfdbqghhat8m");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=3tfdbqghhat8m");
		    WebElement usernametextbox = driver.findElement(By.name("username"));
		    usernametextbox.sendKeys("Admin");
		      WebElement passwardtextfield = driver.findElement(By.name("pwd"));
		      passwardtextfield.sendKeys("manager");
		      
		      Thread.sleep(4000);
		      usernametextbox.clear();
		      passwardtextfield.clear();
		      Thread.sleep(3000);
		      driver.close();
		      
		      
	}

}
