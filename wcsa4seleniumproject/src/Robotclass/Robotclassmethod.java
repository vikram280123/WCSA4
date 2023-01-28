package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclassmethod {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ga_courses_click']")).click();
		
		  Robot robot=new Robot();
		  Thread.sleep(2000);
		   robot.keyPress(KeyEvent.VK_DOWN);
		   Thread.sleep(2000);
		   robot.keyPress(KeyEvent.VK_TAB);
	}

}
