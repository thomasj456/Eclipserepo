package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginvalidation {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("thomas123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		if(s.equals("https://keralaproperty.in/member/myhome/"))
		{
			System .out.println("login validation success");
		}
		else
		{
			System .out.println("login validation fail");
		}
	}
	
	

	

}
