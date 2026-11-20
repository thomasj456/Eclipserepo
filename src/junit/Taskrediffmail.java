package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskrediffmail {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void logoverify() 
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
boolean a=logo.isDisplayed();
	if(a)
		{ 
			System .out.println("logo is Displayedsucessfully");
		}
	else
	{
		System .out.println("logo is not Displayedsucessfully");
		
	}
	
	    WebElement radioButton=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input"));
	    boolean b=radioButton.isSelected();
	    if(b)
	    {
	    	System .out.println("Button is selectedsucessfully");
	    }
	    else
	    {
	    	System .out.println("Button is not slectedsucessfully");
	    }
		
	}

}
