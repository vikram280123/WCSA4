package TestNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_parallel_part2 {
	@Test(threadPoolSize=3,invocationCount=3)
	public void TC1() 
	{
		System.out.println("This is output for TC1"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");

	}
	@Test
	public void TC2() {
		System.out.println("This is output for TC2"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemytrip.com");
}
	//methods are three but threadcount is 2 i xml
	@Test
		public void TC3() {
		  System.out.println("This is output for TC2"+Thread.currentThread().getId());
		}
	

}
