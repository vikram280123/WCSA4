package SelectclassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.get("file:///C:/Users/213/Desktop/webpage/d.html");
	      Thread.sleep(2000);
	      WebElement dropdown = driver.findElement(By.id("menu"));
	             
	                 Select object=new Select(dropdown);
	    
	                     List<WebElement> alloptions = object.getOptions();
	                     for(WebElement option :alloptions) {
	                    	 System.out.println(option.getText());
	}

}
}
