package SelectclassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class operationalsmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/213/Desktop/webpage/d.html");
		driver.manage().window().maximize();
		
		             WebElement target = driver.findElement(By.id("menu"));
		                 Select obj=new Select(target);
		                boolean status = obj.isMultiple();
		                System.out.println(status);
		                Thread.sleep(3000);
	}

}
