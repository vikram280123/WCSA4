package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[.='✕']")).click();
	      
	      driver.findElement(By.name("q")).sendKeys("samsung mobile");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='4★ & above']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='4 GB']")).click();
	      Thread.sleep(2000);
	         WebElement priceofmobile = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)']/ancestor::div[@class='_3pLy-c row']"));
	         
	         System.out.println("priceofmobile");
	           Thread.sleep(3000);
	           
	           driver.close();
	      
	                       
	}

}
