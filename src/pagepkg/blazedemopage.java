package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class blazedemopage {
	WebDriver driver;
	By bdname=By.name("name");
	By bdcompany=By.name("company");
	By bdemail=By.name("email");
	By bdpassword=By.name("password");
	By bdpassword_confirmation=By.name("password_confirmation");
	By bdlogin=By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[6]/div/button");
	public blazedemopage(WebDriver driver){
	this.driver=driver;
	}
	public void setvalues(String name,String company,String email,String password,String 
	password_confirmation)
	{
	driver.findElement(bdname).sendKeys(name);
	driver.findElement(bdcompany).sendKeys(company);
	driver.findElement(bdemail).sendKeys(email);
	driver.findElement(bdpassword).sendKeys(password);
	driver.findElement(bdpassword_confirmation).sendKeys
	(password_confirmation);
	 }
	public void login()
	{
	driver.findElement(bdlogin).click();
	}
}



