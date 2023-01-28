package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Rtp {
	 static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browsername");
		String browservalue=sc.nextLine();
		
		if(browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			  driver= new ChromeDriver();
			  driver.get("http://www.instragram.com/");
			  driver.manage().window().maximize();
			  Thread.sleep(4000);
			  driver.close();

		}else if (browservalue.equalsIgnoreCase("Firefox")) {
    	System.setProperty("webdriver.gecko.driver","./drivers/geckodrive.exe");
    	  System.setProperty("wedriver.gecko.driver","/.drivers/geckodriver.exe");
    	  driver=new FirefoxDriver();
    	  driver.manage().window().maximize();
    	  Thread.sleep(4000);
    	  driver.close();	  
    }
		
	 else {
		System.out.println("enter valid browser");
    } 		  
      
  }   
}

