package junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotpgm2 {
	ChromeDriver driver;
	 @Before
	 public void set()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 @Test
	 public void scrnshot() throws IOException
	 {
	
		 WebElement dayelement=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[6]/div/input"));
         File srcl=dayelement.getScreenshotAs(OutputType.FILE);
         FileHandler.copy(srcl,new File("./ScreenShot//element.png"));
}
}
