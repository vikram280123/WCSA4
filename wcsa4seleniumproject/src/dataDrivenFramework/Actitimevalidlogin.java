package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimevalidlogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=ef8f57t0n4kej");
		   Thread.sleep(2000);
		
		             Flib flib = new Flib();
		                  flib.readExcelData("./data/Actitime.xlsx","Actitime",  1, 0);
		                  flib.readExcelData("./data/Actitime.xlsx","Actitime", 1, 1);
		                  
		             
		                  driver.findElement(By.name("username")).sendKeys("username");
		                  Thread.sleep(2000);
		       		   driver.findElement(By.name("pwd")).sendKeys("password");
		       		   driver.findElement(By.id("loginButton")).click();

		                
		                  
		                  
	}
}
