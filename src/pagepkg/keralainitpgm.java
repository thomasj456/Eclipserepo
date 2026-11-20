package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class keralainitpgm {
	WebDriver driver;
	@FindBy(name="ulogin") WebElement KPemail;
	@FindBy(name="upass") WebElement KPpass;
	@FindBy(id="sub_logbtn") WebElement KPlogin;
	
	public keralainitpgm(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
	}
	public void setvalues(String email,String password)
	{
		KPemail.sendKeys(email);
		KPpass.sendKeys(password);
	}
	public void login()
	{
		KPlogin.click();
	}

}
