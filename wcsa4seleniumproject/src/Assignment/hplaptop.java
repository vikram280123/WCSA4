package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hplaptop {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
      driver.findElement(By.xpath("//button[.='✕']")).click();
      
      driver.findElement(By.name("q")).sendKeys("hp laptop");
      Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
            Thread.sleep(2000);
         driver.findElement(By.xpath("//div[.='Core i5']/descendant::label[@class='_2iDkf8 t0pPfW']")).click();
         Thread.sleep(2000);
         String price = driver.findElement(By.xpath("//div[.='HP Pavilion Ryzen 5 Hexa Core AMD R5-5600H - (8 GB/512 GB SSD/Windows 10/4 GB Graphics/NVIDIA GeForce ...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
         Thread.sleep(2000);
           System.out.println(price);
           driver.close();
}
         
     
	}

