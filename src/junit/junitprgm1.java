package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitprgm1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void titleverification()
	{
		String acttitle=driver.getTitle();
		String exp="Post your Property - Login | Keralaproperty";
		
		if(acttitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void contentverification()
	{
		String Actcontent=driver.getPageSource();
		String expected="New user?";
		if(Actcontent.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	

	
		
	
	
	

}
