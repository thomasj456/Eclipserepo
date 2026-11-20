package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolling {
	WebDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/");
		
		
	}
	@Test
	public void test()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)", "");
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[2]/input")));
		
		
		WebElement t=driver.findElement(By.xpath("html/body/div[4]/div/div[3]/div[1]/form/div[1]/input"));
		t.sendKeys("abc");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  driver.findElement(By.xpath("/html/body/footer/div/ul/li[3]/a")).click();
		
	}

}
