package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	@BeforeTest
	public void browseropen()
	{
		System .out.println("Browser open");
	}
	@BeforeMethod
	public void urlload()
	{
		System .out.println("url load");
	}
	@Test(priority=3,invocationCount=3,dependsOnMethods= {"test3"})
	public void test1()
	{
		System .out.println("Test 1");
	}
	@Test(priority=1,enabled=false)
	public void test2()
	{
		System .out.println("Test 2");
	}
	@Test(priority=2)
	public void test3()
	{
		System .out.println("Test 3");
	}
	@AfterMethod
	public void urlclose()
	{
		System .out.println("url closed");
	}
	@AfterTest
	public void browserclose()
	{
	System .out.println("Browser close");	
	}
	
		
	

}
