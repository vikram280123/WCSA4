package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Actions action = new Actions(driver);
		driver.findElement(By.xpath("//a[.='Droppable']")).click();
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dist = driver.findElement(By.id("droppable"));
		
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dist).perform();

	}

}
