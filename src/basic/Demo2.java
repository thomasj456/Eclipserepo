package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/content/house-for-sale-in-kerala");
		driver.findElement(By.id("ulogin")).sendKeys("abc");
		driver.findElement(By.id("upass")).sendKeys("gjjh");
		driver.findElement(By.id("sub_logbtn")).click();

	}

}
