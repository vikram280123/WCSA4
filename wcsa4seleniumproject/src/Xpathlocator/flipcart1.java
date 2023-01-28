package Xpathlocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart1 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
          driver.findElement(By.xpath("//button[.='✕']")).click();
          driver.findElement(By.name("q")).sendKeys("samsung mobile");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[.='6 GB']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F23 5G (Aqua Blue, 128] GB)'")).click();
          Thread.sleep(3000);
          
          
	}

}
