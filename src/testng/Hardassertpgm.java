package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertpgm {
	WebDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test1()
	{
		String actual=driver.getTitle();
		String expected="www.facebook.com1";
		
		Assert.assertEquals(actual, expected,"title verified");
		System.out.println("title");
		
	}
	@Test
	public void test2()
	{
	   WebElement search=driver.findElement(By.xpath("//*[@id=\"salesearch\"]"));
	   boolean searchenable=search.isEnabled();
	   
	   Assert.assertTrue(searchenable, "it is not enabled");
	}
	
	

}
