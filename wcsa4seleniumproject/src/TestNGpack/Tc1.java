package TestNGpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc1 {
	@BeforeClass
		public void beforeclass()
		{
		System.out.println("this will execute before class");
		}
	@AfterClass
		public void afterclass()
		{
		System.out.println("this will execute afetr the clss");
		}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this method is execute before every method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("this is execute in after the every test case");
	}
	@Test
	public void Test1()
	{
		System.out.println("this is test 1");
	}
	@Test
	public void Test2()
	{
		System.out.println("this is test 2");
	}
	
	

}
