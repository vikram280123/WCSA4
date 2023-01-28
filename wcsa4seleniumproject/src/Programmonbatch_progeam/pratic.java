package Programmonbatch_progeam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.className("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("323234343433");
	      Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("//input[@id='pass']"); 
	       Thread.sleep(2000);
	        driver.findElement(By.xpath("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
	}

}
