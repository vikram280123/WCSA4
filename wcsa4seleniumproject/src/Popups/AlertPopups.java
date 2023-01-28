package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopups {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/213/Desktop/webpage/d.html");
		driver.manage().window().maximize();
		
		             WebElement target = driver.findElement(By.id("menu"));
		                 Select obj=new Select(target);
		                obj.selectByIndex(3);
		                System.out.println(obj);
		     
		     
	}

}
