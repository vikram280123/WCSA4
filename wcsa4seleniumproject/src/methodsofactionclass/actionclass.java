package methodsofactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/buttons");
          Thread.sleep(3000);
	 
	              Actions act = new Actions(driver);
                 WebElement rightclick = driver.findElement(By.xpath("//button[.='Right Click Me']"));
                 act.contextClick(rightclick).perform();
                 
	   
	         
}
		
		 
		 
	}


