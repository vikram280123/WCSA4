package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[.='✕']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung mobile");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='4 GB']/preceding-sibling::div[@class='_24_Dny']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='30% or more']/preceding-sibling::div[@class='_24_Dny']")).click();
	      Thread.sleep(2000);
	      driver.close();
	      
	      
	    		  
	}

}
