package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitpgm2 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("//input[@name='ulogin']")).sendKeys("Thomas@12");
		driver.findElement(By.xpath("//input[@name='upass']")).sendKeys("Qwerty@123");
		driver.findElement(By.xpath("//input[@id='sub_logbtn']")).click();
		
	}
	@After
	public void ending()
	{
		driver.quit();
	}

}
