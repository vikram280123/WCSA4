package Programmonbatch_progeam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		  driver.findElement(By.name("q")).sendKeys("hp laptop");
	      Thread.sleep(2000);
	            driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	            Thread.sleep(2000);
	          driver.findElement(By.xpath("//div[.='4★ & above']/descendant::div[@class='_3879cV']")).click();
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//div[.='Core i5']/descendant::label[@class='_2iDkf8 t0pPfW']")).click();
	          Thread.sleep(2000);
	          
	}

}
