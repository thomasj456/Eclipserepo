package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm2 {
	 ChromeDriver driver;
	 @Before
	 public void set() throws InterruptedException
	 {
		 driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 Thread.sleep(3000);
	 }
	 @Test
	 public void Buttonverify() throws Exception 
		{
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
			Thread.sleep(5000);
		//	driver.switchTo().alert().accept();
			Alert a=driver.switchTo().alert();
			String text=a.getText();
			if(text.equals("I am a JS Alert"))
			{
				System.out.println("pass");
			}
			else
			{
				System .out.println("fail");
			}
			a.accept();
			
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
			Thread.sleep(3000);
			//driver.switchTo().alert().accept();
			 // driver.switchTo().alert().dismiss();
			Alert b=driver.switchTo().alert();
			String txt=b.getText();
			if(txt.equals("I am a JS Alert"))
			{
				System .out.println("pass");
			}
			else
			{
				System .out.println("fail");
			}
			b.accept();
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
			Thread.sleep(3000);
			//driver.switchTo().alert().accept();
			 // driver.switchTo().alert().dismiss();
			Alert c=driver.switchTo().alert();
			String textc=c.getText();
			if(text.equals("I am a JS Confirm"))
			{
				System .out.println("pass");
			}
			else
			{
				System .out.println("fail");
			}
			a.accept();

			
			
				
			
		}
	}	
			

	 


