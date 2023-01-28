package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teat1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	      Thread.sleep(3000);
	      
	      driver.switchTo().activeElement().sendKeys("poha");
	      Thread.sleep(3000);
	                 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='pcTkSc"));
	                 
	            for(int i=0; i<suggestions.size(); i++)
	            {
	            	                WebElement options = suggestions.get(i);
	            	          String opt=options.getText();
	            	          Thread.sleep(3000);
	            	          System.out.println(opt);
	            }
	}
}

	         
