package testpkg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.Excelutils;

public class kptest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@DataProvider (name ="loginData")
	public Object[][] getData() throws IOException
	{
		String path = "D:\\\\TestingDatadriven.xlsx";
		 return Excelutils.getTestData(path, "sheet1");		 
	}
	@Test(dataProvider ="loginData")
	public void loginTest(String username, String password)
	{
		driver.findElement(By.id("ulogin")).sendKeys(username);
		driver.findElement(By.id("upass")).sendKeys(password);
		driver.findElement(By.id("sub_logbtn")).click();
		
		System.out.println("Executed for:" + username);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.urlContains("myhome"));
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Redirected to:"+ currentUrl);
		Assert.assertEquals(currentUrl,"https://keralaproperty.in/member/myhome/",
		"Login may have failed for:"+ username);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
