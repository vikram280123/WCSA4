package Webdrivermethode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.selenium.dev/downloads/");
		                 WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
//		                 
//		               Point loc = download.getLocation();
//		      int xaxis=loc.getX();
//		      int yaxis=loc.getY();
//		      
//		      System.out.println(xaxis!":id the x axis "+ yaxis+": is y axis");
//		      
		
	      Thread.sleep(2000);
	}

}
