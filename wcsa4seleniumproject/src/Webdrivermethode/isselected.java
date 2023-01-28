package Webdrivermethode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/signup");
                 boolean status = driver.findElement(By.className("_8esa")).isSelected();
		 System.out.println(status);
		 Thread.sleep(2000);
		 driver.close();
		 if (status==true) {
	        System.out.println("is selected");
		}
		 else {
			System.out.println("is not selected");
		}
	}

}
