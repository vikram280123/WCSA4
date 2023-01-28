package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		   driver.get("http://127.0.0.1/login.do;jsessionid=qj97d7r5dhis");
		   Flib flib = new Flib();
			int rc = flib.rowCount("./data/Actitimeinvalidcreds.xlsx","Actitimeinvalidcreds");
			for(int i=1;i<=rc;i++)
			{
			String username = flib.readExcelData("./data/Actitimeinvalidcreds.xlsx","Actitimeinvalidcreds",i,0);
			
			String password = flib.readExcelData("./data/Actitimeinvalidcreds.xlsx","Actitimeinvalidcreds",i,1);
			
			   WebElement usn = driver.findElement(By.name("username"));
			   usn.sendKeys(username);
			   WebElement pass = driver.findElement(By.name("pwd"));
			   pass.sendKeys(password);
			   Thread.sleep(2000);
			   driver.findElement(By.id("loginButton")).click();
			   
			   Thread.sleep(2000);
			   driver.findElement(By.name("username")).clear();	
			  
		                        	 
		                        	 
		                        	 
		                         }
	}

}
