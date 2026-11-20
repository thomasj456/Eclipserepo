package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathparentTochild {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void contentverification()
	{
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input")).sendKeys("Thomas J");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("thomas@rediff.com");
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/form/div/div[6]/div/input")).sendKeys("rahul123"); 
	}
	@After
	public void ending()
	{
		driver.quit();
	}

}
