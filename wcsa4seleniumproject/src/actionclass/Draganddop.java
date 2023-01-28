package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		  Actions act=new Actions(driver);
		driver.manage().window().maximize();
		driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(0);
		Thread.sleep(2000);
	      	    WebElement src = driver.findElement(By.id("draggable"));
	      	       WebElement trg = driver.findElement(By.id("droppable"));
	      	         act.dragAndDrop(src, trg).perform();
	      	         if (trg.getText().matches("Dropped")) {
	      	        	 System.out.println("sussessfully dropeed");
	      	        	 Thread.sleep(2000);
	      	        	 driver.close();
						
					}
	      	         
		
	}

}
