package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingninja {
	ChromeDriver driver;
	@BeforeTest
	public void urlload()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void execution() throws IOException, InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("thomas");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("a");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input")).sendKeys("thomas123@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input")).sendKeys("9645423434");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")).sendKeys("qwerty@123");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input")).sendKeys("qwerty@123");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		
		WebElement emailelement=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input"));
		File emailScreenshot=emailelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(emailScreenshot,new File("email.png"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
        
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
		
	
		
		
		

		
	}
}

	     
		
	
	
	
	
		


