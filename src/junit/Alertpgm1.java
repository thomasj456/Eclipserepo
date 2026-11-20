package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm1 {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Documents/alert.html");
		
	}
	@Test
	public void Buttonverify() throws Exception 
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Thread.sleep(5000);
	//	driver.switchTo().alert().accept();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("Hello!I am an alert box!!"))
		{
			System.out.println("pass");
		}
		else
		{
			System .out.println("fail");
		}
			
		
	}
}	
		
		
		
		
		
	
	


