package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test1() throws IOException 
	{
		File f=new File("D:\\Datadriven.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System .out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System .out.println("Username="+username);
			String pswd=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(pswd);
			driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"upass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();

		}
	}

}
