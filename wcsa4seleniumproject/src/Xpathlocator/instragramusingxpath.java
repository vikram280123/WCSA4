package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instragramusingxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys("vikram");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("99223919");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
	      
	}

}
