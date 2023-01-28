package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vikram {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:///www.facebook.com/login/");
		driver.manage().window().maximize();
	      Thread.sleep(4000);
	      driver.findElement(By.cssSelector("input[class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("vicky");
	      Thread.sleep(4000);
	      driver.findElement(By.cssSelector("input[type='password']")).sendKeys("90963934");
	      Thread.sleep(4000);
	      driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")).click();
	      driver.close();
	      
	      
	      
	      FileInputStream fis = new FileInputStream("./data/actitime.xlsx");
	      
	      
	}

}
