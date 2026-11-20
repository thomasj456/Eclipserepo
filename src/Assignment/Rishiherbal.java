package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbal {
	ChromeDriver	 driver;
	@BeforeTest
	public void browser()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test() throws IOException, InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[2]/a")).click();
		String title=driver.getTitle();
		if(title.equals("Herbal Products | Rishi Herbal India"))
		{
			System.out.println("Title pass");
		}
		else
		{
			System.out.println("Title fail");
		}
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/column[1]/div[2]/div[2]/form/div[2]/div[2]/div[2]/ul/li/label/input")).click();
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[3]/div[2]/div[1]/form/div[1]/div/input")).sendKeys("super health");
		
		WebElement img=driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[6]/a"));
		File src=img.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./ScreenShot//baby.png"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/div[3]/div/div[2]/form/select")).click();
		driver.findElement(By.xpath("//*[@id=\"input-sort\"]/option[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[4]/a")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)","");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[14]/div/div/div[1]/div/a/img")));
		
	}
}


