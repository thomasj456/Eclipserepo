package Assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
ChromeDriver driver;
	
	@Before
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
	}
	
	@Test
	public void test()
	{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/div[2]/a")).click();
	driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("invalidemail12e",Keys.ENTER);
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
	
	}
}



