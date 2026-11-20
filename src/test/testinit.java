package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.keralainitpgm;

public class testinit {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void logcheck()
	{
		keralainitpgm obj=new keralainitpgm(driver);
		obj.setvalues("abc@gmail.com", "123456");
		obj.login();
	}

}
