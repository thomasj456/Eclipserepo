package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframepgm {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		
		WebElement innerframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(innerframe);
		
		WebElement text=driver.findElement(By.xpath("/html/body/h1"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();
	}
	@AfterTest
	public void browserclose()
	{
		driver.quit();
	}

	

}
