package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class blazedemologin {
	WebDriver driver;
	@FindBy(name="email") WebElement BDemail;
	@FindBy(name="password")WebElement BDpass;
	@FindBy(xpath="/html/body/div/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement BDlogin;
	public blazedemologin(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements( driver,this);}
	public void setvalues(String email,String password)
	{
	BDemail.sendKeys(email);
	BDpass.sendKeys(password);
	}
	public void login()
	{
	BDlogin.click();
	}
	}

	
