package SelectclassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]")).click();
	
	}

}
