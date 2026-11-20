package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.blazedemologin;

public class blazedemologin1 {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/login");
	}@Test
	public void test()
	{
	blazedemologin ob=new blazedemologin(driver);
	ob.setvalues("thomas@gmail.com","abhi123");
	ob.login();
	}
}


