package SelectclassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/213/Desktop/webpage/d.html");
		driver.manage().window().maximize();
		
		             WebElement dropdownelement = driver.findElement(By.id("menu"));
		                 Select sel=new Select(dropdownelement);
		                     List<WebElement> alloption = sel.getOptions();
		                     for(WebElement opts:alloption)
		                     {
		                    	 System.out.println(opts);
		                     }
		                     Thread.sleep(2000);
		        
					}
	}


